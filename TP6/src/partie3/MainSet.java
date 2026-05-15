package partie3;
import java.util.HashSet;
import java.util.TreeSet;

public class MainSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<String> matieres = new HashSet<>();

        
        matieres.add("Math");
        matieres.add("Java");
        matieres.add("Physique");
        matieres.add("Java");

        
        System.out.println("HashSet :");
        for (String m : matieres) {
            System.out.println(m);
        }

       
        TreeSet<String> trie = new TreeSet<>(matieres);

        System.out.println("\nTreeSet trié :");
        for (String m : trie) {
            System.out.println(m);
        }

	}

}
