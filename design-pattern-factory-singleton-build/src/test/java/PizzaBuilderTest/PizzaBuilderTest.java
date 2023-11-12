package PizzaBuilderTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

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
	
	@Test
	void testEnvoieExceptionPrixNegatif() {
		try {
			Pizza pizza = new PizzaBuilder()
					.choisirNom("Bolognaise")
					.choisirGarniture("Boeuf")
					.choisirPate("Classique")
					.choisirSauce("Sauce tomate")
					.choisirPrix(0)
					.build();
			 fail("Devrait envoyer une exception quand le prix est négatif");
		} catch (IllegalArgumentException e){
			assertTrue(e.getMessage().contains("Certains attributs obligatoires ne sont pas spécifiés ou le prix est négatif."));
		}
	}
}
