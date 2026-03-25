package partie4;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer une chaîne : ");
        String texte = sc.nextLine();

        System.out.println("Longueur = " + texte.length());
        sc.close();


	}

}
