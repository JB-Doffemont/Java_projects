package com.practice.designpattern.pizza;

public class PizzaVegetarienne extends Pizza implements PizzaInterface {

	public PizzaVegetarienne() {
		super("Vegetarienne", "Blé", "Tomate", "artichauds", 14);
	}

	public void prepare() {
		System.out.println("On prépare la pizza");
	}

	public void cuire() {
		System.out.println("15 mn");
	}
}
