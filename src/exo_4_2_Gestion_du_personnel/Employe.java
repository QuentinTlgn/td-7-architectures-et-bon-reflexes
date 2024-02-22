package exo_4_2_Gestion_du_personnel;

public abstract class Employe {
    private int id;
    private String nom;

    public Employe(int id, String nom) {
    this.id = id;
    this.nom = nom;
    }
    // Getters et setters pour les attributs

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}