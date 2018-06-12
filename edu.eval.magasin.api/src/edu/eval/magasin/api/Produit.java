package edu.eval.magasin.api;

public class Produit {
	private int id;
	private String label;
	private double prix;
	private int quantite;
	
	public Produit(){
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", label=" + label + ", prix=" + prix + ", quantite=" + quantite + "]";
	}
	
	
}
