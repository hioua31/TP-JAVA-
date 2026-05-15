package partie1;

public class LectureMontant {

    
    public double lireMontant(String valeur) {

        double montant;


        try {

            montant = Double.parseDouble(valeur);

        } catch (NumberFormatException e) {

            

            System.out.println(
                "[ERREUR] Valeur non numerique : '"
                + valeur
                + "'. Retour valeur par defaut : 0.0"
            );

            return 0.0; 
        }

      
        if (montant < 0) {

           

            throw new IllegalArgumentException(
                "Le montant ne peut pas etre negatif : "
                + montant
            );
        }


        return montant;
    }

    public static void main(String[] args) {

        LectureMontant lm = new LectureMontant();

  
        System.out.println("=== Test 1 : valeur valide ===");

        System.out.println(
            "Montant lu : "
            + lm.lireMontant("75.5")
        );

        System.out.println();


        System.out.println("=== Test 2 : valeur non numerique ===");

        System.out.println(
            "Montant lu : "
            + lm.lireMontant("abc")
        );

        System.out.println();


        System.out.println("=== Test 3 : valeur negative ===");

        try {

            System.out.println(
                "Montant lu : "
                + lm.lireMontant("-30.0")
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                "[ERREUR METIER] "
                + e.getMessage()
            );
        }
    }
}
