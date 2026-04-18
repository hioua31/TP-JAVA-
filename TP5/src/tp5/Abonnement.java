package tp5;

public abstract class  Abonnement {
    protected String nom;
    protected double prixBase;
    protected int nbProfils;

    public Abonnement(String nom, double prixBase, int nbProfils) {
        this.nom = nom;
        this.prixBase = (prixBase > 0) ? prixBase : 50;
        this.nbProfils = (nbProfils > 0) ? nbProfils : 1;
    }

   
    public String getNom() { 
    	return nom;
        }
    
    public double getPrixBase() { 
    	return prixBase; 
    	}
    
    public int getNbProfils() { 
    	return nbProfils;
    	}

    public void setNom(String nom) { 
    	this.nom = nom;
    	}
    
    public void setPrixBase(double prixBase) {
        if (prixBase > 0) {
        	this.prixBase = prixBase;
        }
    }
    
    public void setNbProfils(int nbProfils) {
        if (nbProfils > 0) {
        	this.nbProfils = nbProfils;
        }
    }

    public boolean estPartageFamilial() {
        boolean resultat = (nbProfils >= 3);
        return resultat;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Prix base: " + prixBase);
        System.out.println("Nb profils: " + nbProfils);
        System.out.println("Partage familial: " + estPartageFamilial());
    }
    
    public abstract double calculerCoutMensuel();
    public abstract int calculerScoreSatisfaction();

}
