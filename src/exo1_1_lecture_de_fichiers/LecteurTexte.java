package exo1_1_lecture_de_fichiers;

public class LecteurTexte implements Lecteur {
    private TraitementFichier traitement;

    public LecteurTexte(TraitementFichier traitement) {
        this.traitement = traitement;
    }

    @Override
    public void lire() {
        String contenu = "null";
        traitement.traiter(contenu);
    }
    
    
}
