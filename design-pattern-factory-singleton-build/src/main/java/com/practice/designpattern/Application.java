package com.practice.designpattern;

import com.practice.designpattern.pizza.PizzaFactory;
import com.practice.designpattern.pizza.PizzaInterface;
import com.practice.designpattern.pizza.Pizza;
import com.practice.designpattern.pizza.Pizza.PizzaBuilder;

//import java.util.List;
//
//import com.practice.designpattern.commande.Commande;
import com.practice.designpattern.commande.CommandeManager;	

public class Application {

	public static void main(String[] args) {
		
//		        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
//		                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
//		                "RESULT:" + "\n");
//		        Thread threadFoo = new Thread(new ThreadFoo());
//		        Thread threadBar = new Thread(new ThreadBar());
//		        threadFoo.start();
//		        threadBar.start();
//		    }
//
//		    static class ThreadFoo implements Runnable {
//		        @Override
//		        public void run() {
//		            CommandeManager singleton = CommandeManager.getInstance("FOO");
//		            System.out.println(singleton.value);
//		        }
//		    }
//
//		    static class ThreadBar implements Runnable {
//		        @Override
//		        public void run() {
//		            Singleton singleton = Singleton.getInstance("BAR");
//		            System.out.println(singleton.value);
//		        }
//		    }
//		PizzaInterface pizza = PizzaFactory.createPizza("Fromage");
//		System.out.println(pizza.getNom());
//		System.out.println(pizza.getPate());
//		System.out.println(pizza.getSauce());
//		System.out.println(pizza.getGarniture());
//		System.out.println(pizza.getPrix());
//		pizza.cuire();
//		System.out.println("");
//
//		PizzaInterface pizza1 = PizzaFactory.createPizza("Vegetarienne");
//		System.out.println(pizza1.getNom());
//		System.out.println(pizza1.getPate());
//		System.out.println(pizza1.getSauce());
//		System.out.println(pizza1.getGarniture());
//		System.out.println(pizza1.getPrix());
//		pizza1.cuire();
//		System.out.println("");
//		
//		Pizza nouvellePizza = new PizzaBuilder().choisirNom("Bolognaise")
//				.choisirGarniture("Boeuf")
//				.choisirPate("Classique")
//				.choisirSauce("Sauce tomate")
//				.choisirPrix(15)
//				.build();
//		
//		System.out.println(nouvellePizza.getNom());
//		System.out.println(nouvellePizza.getPate());
//		System.out.println(nouvellePizza.getSauce());
//		System.out.println(nouvellePizza.getGarniture());
//		System.out.println(nouvellePizza.getPrix());
		
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
