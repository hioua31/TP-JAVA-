package tp2;

public class CompteBancaire {
	private int numero;
	private String titulaire;
    private double solde;
    private double decouvertAutorise;

    private static int nbComptes = 0;
    private static double tauxInteretAnnuel = 0.03 ;
    

   
    public CompteBancaire() {
    	nbComptes ++;
        this.numero = nbComptes;
        this.titulaire = "Inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

   
    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
    	nbComptes++ ;
        this.numero = nbComptes;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }
    
    
    public String getTitulaire() {
    	return titulaire; 
    }
    

    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isEmpty())
            this.titulaire = titulaire;
    }
    

    public double getDecouvertAutorise() { 
    	return decouvertAutorise;
    }
    

    public void setDecouvertAutorise(double d) {
        if (d >= 0) this.decouvertAutorise = d;
    }
    
    public void afficher() {
        System.out.println("Compte #" + numero +" || Titulaire: " + titulaire + " || Solde: " + solde + " || Découvert: " + decouvertAutorise);          
    }
    
    
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } 
        else {
            System.out.println("Montant de dépôt invalide.");
        }
    }
	
    public void retirer(double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            solde -= montant;
        } 
        else {
            System.out.println("Retrait refusé.");
        }
    }
    
    
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            this.retirer(montant);
            autre.deposer(montant);
        } 
        else {
            System.out.println("Virement impossible : montant ou solde insuffisant.");
        }
    }
    
    
    // Sans_paramètre
    public double calculerSoldeAvecInterets() {
        solde += solde * tauxInteretAnnuel;
        return solde;
    }
    
    

    // avec_bonus
    public double calculerSoldeAvecInterets(double bonus) {
        solde += solde * (tauxInteretAnnuel + bonus);
        return solde;
    }
    
    
    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public static void setTauxInteretAnnuel(double taux) {
        tauxInteretAnnuel = taux;
    }
}
