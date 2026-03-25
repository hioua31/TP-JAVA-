package partie3;
import java.util.Scanner;
public class EX10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[][] matrice = new int[3][3];

        System.out.println("Entrer les éléments de la matrice :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	
                matrice[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrice transposée :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrice[j][i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

	


