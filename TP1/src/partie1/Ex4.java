package partie1;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez N : ");
        int n = sc.nextInt();
        int somme = 0, i = 1;
        while (i <= n) {
            somme += i;
            i++;
        }
        System.out.println("Somme des " + n + " premiers entiers = " + somme);
    }
}

