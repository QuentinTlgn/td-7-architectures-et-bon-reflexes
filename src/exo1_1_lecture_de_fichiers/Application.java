package exo1_1_lecture_de_fichiers;

public class Application {

    private LecteurFichier lecteur;

    public Application(LecteurFichier lecteur){
        this.lecteur = lecteur;
    }

    public void afficherFichier(String chemin){
        lecteur.ouvrirFichier(chemin);
        lecteur.lire();
    }
}
