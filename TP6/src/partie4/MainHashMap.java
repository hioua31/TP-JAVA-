package partie4;
import java.util.HashMap;
public class MainHashMap {

	public static void main(String[] args) {
		
        HashMap<String, Double> notes = new HashMap<>();

        
        notes.put("Brahim", 14.5);
        notes.put("Sara", 17.0);
        notes.put("Aimad", 12.0);

        
        System.out.println("Notes :");
        for (String nom : notes.keySet()) {
            System.out.println(nom + " : " + notes.get(nom));
        }

        
        System.out.println("\nNote de Sara : " + notes.get("Sara"));

        notes.put("Brahim", 16.0);

        notes.remove("Sara");

        double somme = 0;

        for (double note : notes.values()) {
            somme += note;
        }

        double moyenne = somme / notes.size();

        System.out.println("\nMoyenne générale : " + moyenne);

	}

}
