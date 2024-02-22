package exo1_2_Gestion_de_magasin;

public interface StockageProduit {
    void ajouterProduit(Produit produit);
    void supprimerProduit(Produit produit);
    Produit recupererProduit(String reference);
}
