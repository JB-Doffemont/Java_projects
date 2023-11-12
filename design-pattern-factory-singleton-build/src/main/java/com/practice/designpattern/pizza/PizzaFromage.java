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
	    // Assurez-vous d'appeler build() pour construire réellement la pizza
	    Pizza pizza = builder.build();
	    // Copiez les attributs de la pizza construite vers l'objet courant
	    this.setNom(pizza.getNom());
	    this.setPate(pizza.getPate());
	    this.setSauce(pizza.getSauce());
	    this.setGarniture(pizza.getGarniture());
	    this.setPrix(pizza.getPrix());
	}
	
//	@Override
//	public String getNom() {
//        return super.getNom();
//    }

	public void prepare() {
		System.out.println("En cours de préparation");
	}

	public void cuire() {
		System.out.println("10 mn");
	}
}
