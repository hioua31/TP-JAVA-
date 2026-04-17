package tp4;

public class CompteCourant extends Compte {
    private double decouvertAutorise;

    public CompteCourant(String numero, String titulaire, double solde, double decouvertAutorise) {
        super(numero, titulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    public void retirer(double montant) {
        if (solde - montant >= -decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Depassement du decouvert !");
        }
    }

    public void afficher() {
        super.afficher();
        System.out.println("Decouvert autorise: " + decouvertAutorise);
    }
}
