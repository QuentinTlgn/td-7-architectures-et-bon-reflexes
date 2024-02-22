package exo1_2_Gestion_de_magasin;

import java.util.ArrayList;
import java.util.List;;

public class GestionCommande {
    private StockageProduit stocks;

    public GestionCommande(StockageProduit stocks) {
        this.stocks = stocks;
    }

    public Commande creerCommande(Client client, ArrayList<Produit> refsProduits){
        List<Produit> produitsCommande = new ArrayList<Produit>();
        for(String ref : refsProduits){
            Produit prod = stocks.recupererProduit(ref)
            if(prod != null){
                produitsCommande.add(prod);
            }
        }
    }
}
