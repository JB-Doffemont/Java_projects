package com.practice.designpattern;

import com.practice.designpattern.pizza.PizzaFactory;
import com.practice.designpattern.pizza.PizzaInterface;

public class Application {

	public static void main(String[] args) {
		PizzaInterface pizza = PizzaFactory.createPizza("Fromage");
		pizza.cuire();

		PizzaInterface pizza1 = PizzaFactory.createPizza("Vegetarienne");
		pizza1.cuire();
	}

}
