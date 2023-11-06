package com.practice.designpattern.pizza;

public class PizzaFactory {

	public static Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("Fromage")) {
			pizza = new PizzaFromage();

		} else if (type.equals("Vegetarienne")) {
			pizza = new PizzaVegetarienne();
		}

		return pizza;
	}
}
