package partie1;

public class LectureMontantPropagation {

    
     
    public double lireMontant(String valeur)
            throws NumberFormatException, IllegalArgumentException {

        

        double montant = Double.parseDouble(valeur);

        
      
        if (montant < 0) {

           

            throw new IllegalArgumentException(
                "Le montant ne peut pas etre negatif : "
                + montant
            );
        }

        
        return montant;
    }

    public static void main(String[] args) {

        LectureMontantPropagation lm =
                new LectureMontantPropagation();

        
        System.out.println("=== Test 1 ===");

        try {

            System.out.println(
                "Montant : "
                + lm.lireMontant("99.9")
            );

        } catch (NumberFormatException e) {

            System.out.println(
                "[FORMAT] Valeur non numerique : "
                + e.getMessage()
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                "[METIER] "
                + e.getMessage()
            );
        }

        

        System.out.println("\n=== Test 2 ===");

        try {

            System.out.println(
                "Montant : "
                + lm.lireMontant("xyz")
            );

        } catch (NumberFormatException e) {

            System.out.println(
                "[FORMAT] Valeur non numerique : "
                + e.getMessage()
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                "[METIER] "
                + e.getMessage()
            );
        }

        System.out.println("\n=== Test 3 ===");

        try {

            System.out.println(
                "Montant : "
                + lm.lireMontant("-50.0")
            );

        } catch (NumberFormatException e) {

            System.out.println(
                "[FORMAT] Valeur non numerique : "
                + e.getMessage()
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                "[METIER] "
                + e.getMessage()
            );
        }
    }
}
