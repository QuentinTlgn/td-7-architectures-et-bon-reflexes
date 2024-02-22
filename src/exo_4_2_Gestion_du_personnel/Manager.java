package exo_4_2_Gestion_du_personnel;

public class Manager extends Employe {
    
    private String departement;
    private double salaireBase = 3000;

    public Manager(int id, String nom, String departement) {
        super(id,nom);
        this.departement = departement;
        //TODO Auto-generated constructor stub
    }

    public String getdepartement() {
        return departement;
    }

    public double getSalaireBase() {
        return salaireBase;
    }
}
