package partie2;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Entrer la taille de tableau : ");
	        int s = sc.nextInt();

	        int[] b = new int[s];

	        for (int i = 0; i < s; i++) {
	            System.out.print("Element " + (i +1)+ " : ");
	            b[i] = sc.nextInt();
	        }
	        int max = b[1];
	        
	        for (int i = 1; i < s; i++) {
	          if (max < b[i]) {
	        	  max = b[i];
	          }
	        }
	        System.out.print("Le plus grand valeur de tableau "+ max);
	        sc.close();
	}

}
