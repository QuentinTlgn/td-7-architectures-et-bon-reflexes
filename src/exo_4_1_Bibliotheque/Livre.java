package exo_4_1_Bibliotheque;

public class Livre {
    private String titre;
    private String auteur;
    private CategorieLivre categorie;

    public Livre(String titre, String auteur, CategorieLivre categorie) {
        this.titre = titre;
        this.auteur = auteur;
        this.categorie = categorie;
    }
}
