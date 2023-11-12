package PizzaBuilderTest;

import org.junit.jupiter.api.Test;
import com.practice.designpattern.pizza.Pizza.PizzaBuilder;
import com.practice.designpattern.pizza.Pizza;

public class PizzaBuilderTest {

	// Test de creation de pizza avec le builder
	@Test
	void testBuildPizza() {
		Pizza pizza = new PizzaBuilder()
				.choisirNom("Bolognaise")
				.choisirGarniture("Boeuf")
				.choisirPate("Classique")
				.choisirSauce("Sauce tomate")
				.choisirPrix(15)
				.build();
		
		System.out.println(pizza.getNom());
		System.out.println(pizza.getPate());
		System.out.println(pizza.getSauce());
		System.out.println(pizza.getGarniture());
		System.out.println(pizza.getPrix());
		
	}
}
