package com.practice.designpattern.commande;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe CommandeManager gère les opérations liées aux commandes.
 * C'est une classe Singleton, ce qui signifie qu'il ne peut y avoir qu'une seule instance de CommandeManager.
 */
public class CommandeManager {

    // Liste pour stocker les commandes
    private List<Commande> commandes = new ArrayList<>();

    // Instance unique de CommandeManager
    private static CommandeManager instance;

    // Constructeur privé pour empêcher l'instanciation directe
    private CommandeManager() {
        System.out.println("Instance créée");
    }

    /**
     * Méthode pour obtenir l'instance unique de CommandeManager (Singleton).
     * Utilise une vérification double-lock pour assurer la robustesse en environnement multithread.
     *
     * @return L'instance unique de CommandeManager.
     */
    public static CommandeManager getInstance() {
        if (instance == null) {
            synchronized (CommandeManager.class) {
                if (instance == null) {
                    instance = new CommandeManager();
                }
            }
        }
        return instance;
    }

    /**
     * Retourne la liste des commandes.
     *
     * @return La liste des commandes.
     */
    public List<Commande> getlisteCommandes() {
        return commandes;
    }

    /**
     * Ajoute une nouvelle commande à la liste.
     *
     * @param nouvelleCommande La nouvelle commande à ajouter.
     */
    public void ajouterCommande(Commande nouvelleCommande) {
        commandes.add(nouvelleCommande);
    }

    /**
     * Modifie les détails d'une commande existante.
     *
     * @param numeroCommande  Le numéro de la commande à modifier.
     * @param typePizza       Le nouveau type de pizza.
     * @param quantite        La nouvelle quantité.
     * @param adresseLivraison La nouvelle adresse de livraison.
     * @param etat            Le nouvel état de la commande.
     */
    public void modifierCommande(int numeroCommande, String typePizza, int quantite, String adresseLivraison,
                                 String etat) {
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

    /**
     * Supprime une commande de la liste.
     *
     * @param numeroCommande Le numéro de la commande à supprimer.
     */
    public void supprimerCommande(int numeroCommande) {
        commandes.removeIf(commande -> commande.getNumero() == numeroCommande);
        System.out.println("Commande supprimée !");
        System.out.println("");
    }

    /**
     * Affiche la liste des commandes.
     */
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
