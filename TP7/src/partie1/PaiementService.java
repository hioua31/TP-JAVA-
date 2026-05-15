package partie1;
public class PaiementService {

    
    public double effectuerPaiement(double montant, double solde) {

       
        if (montant <= 0) {

            throw new IllegalArgumentException(
                "Montant invalide : doit etre superieur a zero. Valeur recue : " + montant
            );
        }

        
        if (montant > solde) {

            throw new ArithmeticException(
                "Solde insuffisant : solde=" + solde +
                ", montant demande=" + montant
            );
        }

        return solde - montant;
    }

    public static void main(String[] args) {

        PaiementService service = new PaiementService();


        System.out.println("=== Test 1 : paiement valide ===");

        try {

            double nouveauSolde =
                service.effectuerPaiement(50.0, 200.0);

            System.out.println(
                "Paiement OK. Nouveau solde : "
                + nouveauSolde + " EUR"
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                "Erreur de saisie : " + e.getMessage()
            );

        } catch (ArithmeticException e) {

            System.out.println(
                "Erreur metier : " + e.getMessage()
            );

        } finally {

            System.out.println(
                ">>> Fin de la transaction\n"
            );
        }

     
        System.out.println("=== Test 2 : montant invalide ===");

        try {

            double nouveauSolde =
                service.effectuerPaiement(-10.0, 200.0);

            System.out.println(
                "Paiement OK. Nouveau solde : "
                + nouveauSolde
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                "Erreur de saisie : " + e.getMessage()
            );

        } catch (ArithmeticException e) {

            System.out.println(
                "Erreur metier : " + e.getMessage()
            );

        } finally {

            System.out.println(
                ">>> Fin de la transaction\n"
            );
        }

        System.out.println("=== Test 3 : solde insuffisant ===");

        try {

            double nouveauSolde =
                service.effectuerPaiement(500.0, 100.0);

            System.out.println(
                "Paiement OK. Nouveau solde : "
                + nouveauSolde
            );

        } catch (IllegalArgumentException e) {

            System.out.println("Erreur de saisie : " + e.getMessage());
                

        } catch (ArithmeticException e) {

            System.out.println(
                "Erreur metier : " + e.getMessage()
            );

        } finally {

            System.out.println(
                ">>> Fin de la transaction"
            );
        }
    }
}