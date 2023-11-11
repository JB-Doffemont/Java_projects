package com.practice.designpattern.commande;

import java.util.*;
import com.practice.designpattern.commande.Commande;


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

	public void ajouterCommande(Commande nouvelleCommande) {
		commandes.add(nouvelleCommande);
	}
	
	public void modifierCommande(int numeroCommande, String typePizza, int quantite, String adresseLivraison, String etat) {
		for (Commande commande : commandes) {
			if (commande.getNumero() == numeroCommande) {
				commande.setTypePizza(typePizza);
				commande.setAdresseLivraison(adresseLivraison);
				commande.setQuantite(quantite);
				commande.setEtat(etat);
				System.out.println("Commande modifiée !");
				System.out.println("");
				break;
			}
		}
	}
	
	public void supprimerCommande(int numeroCommande) {
		for (Commande commande : commandes) {
			if (commande.getNumero() == numeroCommande) {
				commandes.remove(commande);
				System.out.println("Commande supprimée !");
				System.out.println("");
				break;
			}
		}
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
