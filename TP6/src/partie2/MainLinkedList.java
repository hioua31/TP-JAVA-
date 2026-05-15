package partie2;
import java.util.LinkedList;

public class MainLinkedList {

	public static void main(String[] args) {
		
        LinkedList<Client> file = new LinkedList<>();

        
        file.add(new Client(1, "Mohamed"));
        file.add(new Client(2, "Sara"));
        file.add(new Client(3, "Walid"));

        
        System.out.println("File d'attente :");
        for (Client c : file) {
            System.out.println(c);
        }

        
        Client servi = file.poll();
        System.out.println("\nClient servi : " + servi);

        
        file.addLast(new Client(4, "Yassine"));

        
        System.out.println("\nPremier client : " + file.peek());

        
        System.out.println("\nNouvelle file :");
        for (Client c : file) {
            System.out.println(c);
        }

	}

}
