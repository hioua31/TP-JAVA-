package partie2;

public class Client {
    int numero;
    String nom;

    public Client(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return numero + " - " + nom;
    }
}



