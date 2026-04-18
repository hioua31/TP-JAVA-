package tp5;

public class TestAbonnements {

	public static void main(String[] args) {
		Abonnement[] abonnements = new Abonnement[3];

		abonnements[0] = new AbonnementVideo("Netflix", 80, 4, true, true);
		abonnements[1] = new AbonnementMusique("Spotify", 50, 2, 25, true);
		abonnements[2] = new AbonnementJeux("GamePass", 70, 1, 60, 45);
		

        System.out.println("=== Liste des abonnements ===");

        for (Abonnement a : abonnements) {
            a.afficherInfos();
            System.out.println("Cout mensuel: " + a.calculerCoutMensuel());
            System.out.println("Score satisfaction: " + a.calculerScoreSatisfaction());
            System.out.println("----------------------");
        }

        System.out.println("\n=== Test réduction ===");

        Reducible[] reducibles = {
                (Reducible) abonnements[0],
                (Reducible) abonnements[1]
        };

        for (Reducible r : reducibles) {
            System.out.println("20% réduction: " + r.appliquerReduction(20));
            System.out.println("50% réduction: " + r.appliquerReduction(50));
        }
    }

}


