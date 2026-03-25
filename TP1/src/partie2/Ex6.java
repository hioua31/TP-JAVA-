package partie2;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int[] t = new int[10];
	        
	       
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Element " + i + " : ");
	            t[i] = sc.nextInt();
	        }
	        
	        System.out.print("Entrer nombre a rechercher  : ");
	        int n = sc.nextInt();
	        
	        for (int i = 0; i < 10; i++) {
	        	if (t[i]== n) {
	        		int s = i;
	        	    System.out.println("sa position "+s );
	        	}
	        	sc.close();
	        }

	}

}
