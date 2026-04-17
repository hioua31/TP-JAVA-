package tp4;

public class ComptePremium extends Compte {
    private double plafondRetrait;

    public ComptePremium(String numero, String titulaire, double solde, double plafondRetrait) {
        super(numero, titulaire, solde);
        this.plafondRetrait = plafondRetrait;
    }

    public void retirer(double montant) {
    	
        if (montant > plafondRetrait) {
            System.out.println("Plafond dépassé !");
        }
        else if (solde >= montant) {
            solde -= montant;
        }
        else {
            System.out.println("Solde insuffisant !");
        }
    }
}
