package com.practice.designpattern.pizza;

import com.practice.designpattern.pizza.Pizza.PizzaBuilder;

public class PizzaFromage extends Pizza implements PizzaInterface {

	public PizzaFromage() {
		super();
	    PizzaBuilder builder = creationBuilder();
	    builder.choisirNom("Pizza au Fromage")
	            .choisirPate("Classique")
	            .choisirSauce("Tomate")
	            .choisirGarniture("Fromage")
	            .choisirPrix(10);
	    // On appelle build() pour construire réellement la pizza
	    Pizza pizza = builder.build();
	    // Copie des attributs de la pizza construite vers l'objet courant
	    this.setNom(pizza.getNom());
	    this.setPate(pizza.getPate());
	    this.setSauce(pizza.getSauce());
	    this.setGarniture(pizza.getGarniture());
	    this.setPrix(pizza.getPrix());
	}
	
	public void prepare() {
		System.out.println("En cours de préparation");
	}

	public void cuire() {
		System.out.println("10 mn");
	}
}
