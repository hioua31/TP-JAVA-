package partie1;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer a : ");
        int a = sc.nextInt();

        System.out.print("Entrer b : ");
        int b = sc.nextInt();

        System.out.print("Entrer c : ");
        int c = sc.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Le plus grand valeur : " + max);
        sc.close();
	}
}

