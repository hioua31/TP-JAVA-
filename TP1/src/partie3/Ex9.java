package partie3;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int somme = 0;

        
        System.out.println("Entrer les éléments de la matrice 3x3 :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                mat[i][j] = sc.nextInt();
            }
        }

       
        System.out.println("Matrice  est :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
                somme = somme + mat[i][j];
            }
            System.out.println();
        }

               System.out.println("Somme des éléments = " + somme);
               sc.close();
    }
}

	