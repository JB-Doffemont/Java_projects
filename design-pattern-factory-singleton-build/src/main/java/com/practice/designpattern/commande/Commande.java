package com.practice.designpattern.commande;

public class Commande {

	private int numero;
	private String typePizza;
	private int quantite;
	private String adresseLivraison;
	private String etat;

	public Commande(int numero, String typePizza, int quantite, String adresseLivraison, String etat) {
		this.numero = numero;
		this.typePizza = typePizza;
		this.quantite = quantite;
		this.adresseLivraison = adresseLivraison;
		this.etat = etat;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTypePizza() {
		return typePizza;
	}

	public void setTypePizza(String typePizza) {
		this.typePizza = typePizza;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public String getAdresseLivraison() {
		return adresseLivraison;
	}

	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

}
