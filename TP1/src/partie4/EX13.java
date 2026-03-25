package partie4;
import java.util.Scanner;

public class EX13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrer une chaîne : ");
        String texte = sc.nextLine();

        String inverse = "";

        for (int i = texte.length() - 1; i >= 0; i--) {
            inverse += texte.charAt(i);
        }

        System.out.println("Chaîne inversée : " + inverse);
        sc.close();
    }
}

