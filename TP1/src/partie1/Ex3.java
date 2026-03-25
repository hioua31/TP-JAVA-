package partie1;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Entrer un nombre : ");
        int a = sc.nextInt();
        
        int i;
        for (i=0; i<=10;i++) {
        	 System.out.println(a + " x " + i + " = " + (a * i));
        }
        sc.close();
	}
}

