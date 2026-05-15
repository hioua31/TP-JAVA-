package partie6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Bibliotheque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        ArrayList<Livre> livres = new ArrayList<>();

        livres.add(new Livre("111", "Java", "Hicham", 2020));
        livres.add(new Livre("222", "Python", "Sara", 2021));
        livres.add(new Livre("333", "C++", "Amine", 2019));

       
        HashSet<String> categories = new HashSet<>();

        categories.add("Programmation");
        categories.add("Base de données");
        categories.add("Réseaux");

        
        HashMap<String, String> emprunts = new HashMap<>();

        emprunts.put("Yassine", "Java");
        emprunts.put("Meryem", "Python");

        
        System.out.println("Recherche du livre Java :");

        for (Livre l : livres) {
            if (l.titre.equalsIgnoreCase("Java")) {
                System.out.println(l);
            }
        }

        
        livres.removeIf(l -> l.isbn.equals("333"));

        
        System.out.println("\nLivres disponibles :");

        for (Livre l : livres) {
            System.out.println(l);
        }

       

        System.out.println("\nCatégories :");
        System.out.println(categories);

        System.out.println("\nEmprunts :");
        System.out.println(emprunts);

	}

}
