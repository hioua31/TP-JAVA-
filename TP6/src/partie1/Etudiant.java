package partie1;

class Etudiant {
    int id;
    String nom;
    double moyenne;

    public Etudiant(int id, String nom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    @Override
    public String toString() {
        return "ID : " + id + " | Nom : " + nom + " | Moyenne : " + moyenne;
    }
}



