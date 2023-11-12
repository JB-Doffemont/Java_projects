package com.practice.designpattern.pizza;

public class PizzaVegetarienne extends Pizza implements PizzaInterface {

	public PizzaVegetarienne() {
		PizzaBuilder builder = creationBuilder();
		builder.choisirNom("Vegies")
        .choisirPate("Blé")
        .choisirSauce("Tomate")
        .choisirGarniture("Tomates, Artichauds")
        .choisirPrix(10);
		
		Pizza pizza = builder.build();
		
		this.setNom(pizza.getNom());
		this.setPate(pizza.getPate());
		this.setSauce(pizza.getSauce());
		this.setGarniture(pizza.getGarniture());
		this.setPrix(pizza.getPrix());
	}
	

	public void prepare() {
		System.out.println("On prépare la pizza");
	}

	public void cuire() {
		System.out.println("15 mn");
	}
}
