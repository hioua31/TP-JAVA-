package tp4;

public class TestBanque {
    public static void main(String[] args) {
    	
       
        Compte[] comptes = new Compte[4];

        comptes[0] = new CompteCourant("CC001", "hicham",   2000, 600);
        comptes[1] = new CompteEpargne("CE001", "aya",     2050, 6.6);
        comptes[2] = new ComptePremium("CP001", "ali", 5030, 1200);
        comptes[3] = new CompteCourant("CC002", "mohamed",   303,  340);

        System.out.println("=====Opérations sur tous les comptes =====\n");

        for (Compte c : comptes) {
            c.deposer(100);
            c.retirer(300);
            c.afficher();
     
        }

     
        System.out.println("\n===== Comptes Épargne uniquement =====\n");

        for (Compte c : comptes) {
            if (c instanceof CompteEpargne) {
                c.afficher();
            }
        }
    }
}
