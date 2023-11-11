package com.practice.designpattern.commande;

import java.util.*;

public class CommandeManager {

	private List<Commande> commandes = new ArrayList<>();

	private static CommandeManager instance;

	private CommandeManager() {

	}

	public static CommandeManager getinstance() {
		if (instance == null) {
			instance = new CommandeManager();
		}
		return instance;
	}
	
	public List<Commande> getlisteCommandes() {
		return commandes;
	}

	public List<Commande> ajouterCommande(Commande nouvelleCommande) {
		commandes.add(nouvelleCommande);
		return commandes;
	}

	public void imprimerListeCommandes() {
	        for (Commande commande : commandes) {
	            System.out.println("Numéro de commande : " + commande.getNumero());
	            System.out.println("Type de pizza : " + commande.getTypePizza());
	            System.out.println("Quantité : " + commande.getQuantite());
	            System.out.println("Adresse de livraison : " + commande.getAdresseLivraison());
	            System.out.println("État : " + commande.getEtat());
	            System.out.println(); // Ajoute une ligne vide entre chaque commande
	        }
	}
}
