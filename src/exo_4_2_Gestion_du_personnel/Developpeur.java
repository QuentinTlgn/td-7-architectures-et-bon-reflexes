package exo_4_2_Gestion_du_personnel;

public class Developpeur extends Employe {
    private String langagePrefere;
    private double salaireBase = 2000;

    public Developpeur(int id, String nom, String langagePrefere) {
        super(id,nom);
        this.langagePrefere = langagePrefere;
        //TODO Auto-generated constructor stub
    }

    public String getLangagePrefere() {
        return langagePrefere;
    }

    public double getSalaireBase() {
        return salaireBase;
    }
    
}
