package com.practice.designpattern;

import com.practice.designpattern.pizza.PizzaFactory;
import com.practice.designpattern.pizza.PizzaInterface;
import com.practice.designpattern.pizza.Pizza;
import com.practice.designpattern.pizza.Pizza.PizzaBuilder;

//import java.util.List;
//
//import com.practice.designpattern.commande.Commande;
//import com.practice.designpattern.commande.CommandeManager;	

public class Application {

	public static void main(String[] args) {
		PizzaInterface pizza = PizzaFactory.createPizza("Fromage");
		System.out.println(pizza.getNom());
		pizza.cuire();

		PizzaInterface pizza1 = PizzaFactory.createPizza("Vegetarienne");
		pizza1.cuire();
		
		Pizza nouvellePizza = new PizzaBuilder().choisirNom("Bolognaise")
				.choisirGarniture("Boeuf")
				.choisirPate("classique")
				.choisirSauce("tomate")
				.choisirPrix(15)
				.build();
		
		System.out.println(nouvellePizza.getNom());
		
//		
//		Commande nouvelleCommande = new Commande(182, "Fromage", 1, "3 rue de la pizza", "En cours de livraison");
//		Commande nouvelleCommande1 = new Commande(183, "Vegetarienne", 1, "2 boulevard du médecin", "En cours de livraison");
//		
//		
//		
//		List<Commande> commandes = commandeManager.getlisteCommandes();
//		commandeManager.ajouterCommande(nouvelleCommande);
//		commandeManager.ajouterCommande(nouvelleCommande1);
//		
//		commandeManager.imprimerListeCommandes(commandes);
	}

}
