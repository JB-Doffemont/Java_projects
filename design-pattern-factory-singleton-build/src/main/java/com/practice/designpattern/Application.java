package com.practice.designpattern;

import com.practice.designpattern.pizza.Pizza;
import com.practice.designpattern.pizza.PizzaFactory;


public class Application {
	
	public static void main(String[] args) {
		Pizza pizza = PizzaFactory.createPizza("Fromage");
		System.out.println(pizza.getPrix());
	}

}
