package exo1_1_lecture_de_fichiers;

public class LecteurFichier implements TraitementFichier{

    private TraitementFichier traitement;

    public void lireFichier(String chemin) {
        // Code pour lire le fichier et afficher son contenu
    }

    public void traiter(){}

    public void lire() {
        String contenu = "null";
        traitement.traiter(contenu);
    }

    public void ouvrirFichier(String chemin){}

    @Override
    public void traiter(String contenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'traiter'");
    }

}
