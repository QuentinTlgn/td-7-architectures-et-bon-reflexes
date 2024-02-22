package exo1_2_Gestion_de_magasin;

import java.util.ArrayList;

public class StockageProduitImpl implements StockageProduit{

    public StockageProduitImpl() {
        this.produits = new ArrayList<Produit>();
    }

    private ArrayList<Produit> produits = new ArrayList<Produit>();

    @Override
    public void ajouterProduit(Produit produit) {
        produits.add(produit)
    }

    @Override
    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
    }

    @Override
    public Produit recupererProduit(String reference) {
        //utiliser une boucle for
        return null;
    }


    
}
