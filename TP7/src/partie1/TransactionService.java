package partie1;

public class TransactionService {

    
    public double lireTransaction(double[] tab, int index) {

       

        return tab[index];
    }

    public static void main(String[] args) {

        TransactionService ts =
                new TransactionService();

        double[] transactions = {
            150.0,
            89.5,
            320.0
        };

        
        System.out.println(
            "=== Test 1 : acces valide (index=1) ==="
        );

        try {

            double val =
                    ts.lireTransaction(transactions, 1);

            System.out.println(
                "Transaction : "
                + val
                + " EUR"
            );

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "[ERREUR] Indice invalide : "
                + e.getMessage()
            );

        } catch (NullPointerException e) {

            System.out.println(
                "[ERREUR] Tableau non initialise."
            );
        }

       
        System.out.println(
            "\n=== Test 2 : index hors bornes (index=10) ==="
        );

        try {

            double val =
                    ts.lireTransaction(transactions, 10);

            System.out.println(
                "Transaction : "
                + val
            );

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "[ERREUR] Indice invalide : "
                + "l'index 10 n'existe pas "
                + "(taille du tableau : "
                + transactions.length
                + ")"
            );

        } catch (NullPointerException e) {

            System.out.println(
                "[ERREUR] Tableau non initialise."
            );
        }


        System.out.println(
            "\n=== Test 3 : tableau null ==="
        );

        try {

            double val =
                    ts.lireTransaction(null, 0);

            System.out.println(
                "Transaction : "
                + val
            );

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "[ERREUR] Indice invalide : "
                + e.getMessage()
            );

        } catch (NullPointerException e) {

            System.out.println(
                "[ERREUR] Tableau non initialise : "
                + "impossible d'acceder "
                + "a un tableau null."
            );
        }

       

        System.out.println(
            "\n=== Test 4 : index negatif (index=-1) ==="
        );

        try {

            double val =
                    ts.lireTransaction(transactions, -1);

            System.out.println(
                "Transaction : "
                + val
            );

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "[ERREUR] Indice invalide : "
                + "index negatif non autorise."
            );

        } catch (NullPointerException e) {

            System.out.println(
                "[ERREUR] Tableau non initialise."
            );
        }
    }
}
