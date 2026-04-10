package tp3;

public class TestParking {
    public static void main(String[] args) {

        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("23 A 12345", "Toyota", 5);
        v[1] = new Voiture("22 C 5467", "BMW", 4);
        v[2] = new Moto("31 F 1207", "Yamaha", true);
        v[3] = new Camion("38 A 3454", "MAN", 13.5);

        
        for (Vehicule veh : v) {
            veh.stationner();
            veh.afficher();
            System.out.println("-------------");
        }

        
        System.out.println("=== Voitures seulement ===");
        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
            }
        }

        
        Vehicule x = new Moto("11C22", "Yamaha", true);

     
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur : x n'est pas une Voiture !");
        }
    }
}

