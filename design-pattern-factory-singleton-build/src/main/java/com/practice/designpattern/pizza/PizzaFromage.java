package com.practice.designpattern.pizza;

public class PizzaFromage extends Pizza implements PizzaInterface {

	public PizzaFromage() {
		super("3 Fromages", "Blé", "Tomate", "Chèvre, roquefort et gruyère", 13);
	}

	public void prepare() {
		System.out.println("En cours de préparation");
	}

	public void cuire() {
		System.out.println("10 mn");
	}
}
