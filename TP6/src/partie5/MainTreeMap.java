package partie5;
import java.util.TreeMap;

public class MainTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeMap<Integer, String> etudiants = new TreeMap<>();

        
        etudiants.put(131, "Ali");
        etudiants.put(122, "Sara");
        etudiants.put(19, "Amine");
        etudiants.put(120, "Yassine");

        
        System.out.println("Liste triée :");
        System.out.println(etudiants);

        
        System.out.println("\nPremier : "
                + etudiants.firstEntry());

        System.out.println("Dernier : "
                + etudiants.lastEntry());

        
        System.out.println("\nNuméro > 100 :");
        System.out.println(etudiants.tailMap(100));

	}

}
