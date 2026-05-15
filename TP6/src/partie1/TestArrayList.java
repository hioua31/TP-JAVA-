package partie1;
import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Etudiant> liste = new ArrayList<>();

       
        liste.add(new Etudiant(1, "Hicham", 14.0));
        liste.add(new Etudiant(2, "Ahmed", 7.0));
        liste.add(new Etudiant(3, "Yassine", 12.0));
        liste.add(new Etudiant(4, "Yousef", 10.5));
        liste.add(new Etudiant(5, "Amine", 18.0));

        
        System.out.println("Liste des étudiants :");
        for (Etudiant e : liste) {
            System.out.println(e);
        }

        
        String recherche = "Amine";
        System.out.println("\nRecherche :");
        for (Etudiant e : liste) {
            if (e.nom.equalsIgnoreCase(recherche)) {
                System.out.println("Trouvé : " + e);
            }
        }

       
        int idSupp = 3;
        liste.removeIf(e -> e.id == idSupp);

        System.out.println("\nAprès suppression :");
        for (Etudiant e : liste) {
            System.out.println(e);
        }

       
        Collections.sort(liste, Comparator.comparingDouble(e -> e.moyenne));

        System.out.println("\nAprès tri :");
        for (Etudiant e : liste) {
            System.out.println(e);
        }

        
        Etudiant meilleur = Collections.max(liste,
                Comparator.comparingDouble(e -> e.moyenne));

        System.out.println("\nMeilleur étudiant :");
        System.out.println(meilleur);
   
    	
    }
}
        

