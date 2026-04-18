package tp5;

public class AbonnementVideo extends Abonnement implements Reducible {

    private boolean optionHD;
    private boolean option4K;

    public AbonnementVideo(String nom, double prixBase, int nbProfils,
                           boolean optionHD, boolean option4K) {
        super(nom, prixBase, nbProfils);
        this.optionHD = optionHD;
        this.option4K = option4K;
    }

    @Override
    public double calculerCoutMensuel() {
        double total = getPrixBase();

        if (optionHD) total += 10;
        if (option4K) total += 20;

        return total;
    }

    @Override
    public int calculerScoreSatisfaction() {
        int score = 60;

        if (optionHD) {
        	score += 10;
        }
        
        if (option4K) {
        	score += 20;
        }
        
        if (getNbProfils() >= 4) {
        	score += 10;
        }

        return Math.min(score, 100);
    }

    @Override
    public boolean estEligibleReduction(double p) {
        return p <= 30;
    }

    @Override
    public double appliquerReduction(double p) {
        if (estEligibleReduction(p)) {
            return calculerCoutMensuel() * (1 - p / 100);
        }
        return calculerCoutMensuel();
    }
}