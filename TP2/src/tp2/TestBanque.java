package tp2;

public class TestBanque {

	public static void main(String[] args) {
		Banque b = new Banque("MarocBank", 1500);

        CompteBancaire c1 = new CompteBancaire("Ali", 1000, 500);
        CompteBancaire c2 = new CompteBancaire("Sara", 2000, 300);
        CompteBancaire c3 = new CompteBancaire("Youssef", 1500, 400);

        b.ajouterCompte(c1);
        b.ajouterCompte(c2);
        b.ajouterCompte(c3);

      
        c1.deposer(500);
        c1.retirer(300);
        c2.virementVers(c3, 700);

     
        b.afficherTous();

        
        c2.calculerSoldeAvecInterets();
        c2.calculerSoldeAvecInterets(0.015);

       
        System.out.println("Nombre total de comptes: " + CompteBancaire.getNbComptes());
        System.out.println("Taux intérêt: " + CompteBancaire.getTauxInteretAnnuel());
		

	}

}
