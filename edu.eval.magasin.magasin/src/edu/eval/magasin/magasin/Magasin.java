package edu.eval.magasin.magasin;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Observable;

import edu.eval.magasin.api.MagasinAchat;
import edu.eval.magasin.api.Produit;

public class Magasin extends Observable implements MagasinAchat {

	Map<Long, Produit> produits = new HashMap<>();

	@Override
	public void achatProduit(Long idProduit, int quantite) {
		Produit bought = produits.get(idProduit);
		if(bought == null || bought.getQuantite() < quantite) {
			throw new NoSuchElementException("Produit introuvable ou quantite insuffisante.");
		}
		bought.setQuantite(bought.getQuantite() - quantite);
		setChanged();
		notifyAll();
	}
	
	
	
}
