package partie2;
import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	        System.out.print("Entrer la taille : ");
	        int n = sc.nextInt();

	        int[] tab = new int[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Element " + i + " : ");
	            tab[i] = sc.nextInt();
	        }

	        System.out.println("Les éléments du tableau :");

	        for (int i = 0; i < n; i++) {
	            System.out.print(tab[i]);
	        }
	        sc.close();
	}

}
