package com.practice.designpattern.pizza;

public class Pizza implements PizzaInterface {

	private String nom;
	private String pate;
	private String sauce;
	private String garniture;
	private int prix;

	public Pizza(String nom, String pate, String sauce, String garniture, int prix) {
		super();
		this.nom = nom;
		this.pate = pate;
		this.sauce = sauce;
		this.garniture = garniture;
		this.prix = prix;
	}

	public void cuire() {

	}

	public void prepare() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPate() {
		return pate;
	}

	public void setPate(String pate) {
		this.pate = pate;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public String getGarniture() {
		return garniture;
	}

	public void setGarniture(String garniture) {
		this.garniture = garniture;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

}
