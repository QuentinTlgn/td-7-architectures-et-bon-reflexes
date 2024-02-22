package exo1_1_lecture_de_fichiers;

public class LecteurTexte implements TraitementFichier{
    private TraitementFichier traitement;

    public LecteurTexte(TraitementFichier traitement) {
        this.traitement = traitement;
    }

    @Override
    public void traiter(String contenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'traiter'");
    }  
}
