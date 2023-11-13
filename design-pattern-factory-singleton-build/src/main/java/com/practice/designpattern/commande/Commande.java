package com.practice.designpattern.commande;

/**
 * La classe Commande représente une commande de pizza avec des attributs tels que le numéro de commande,
 * le type de pizza, la quantité, l'adresse de livraison et l'état de la commande.
 */
public class Commande {

    private int numero;               // Numéro de la commande
    private String typePizza;         // Type de pizza commandé
    private int quantite;             // Quantité de pizzas dans la commande
    private String adresseLivraison;  // Adresse de livraison pour la commande
    private String etat;              // État actuel de la commande

    /**
     * Constructeur de la classe Commande permettant d'initialiser les attributs lors de la création d'une nouvelle commande.
     * @param numero Numéro de commande unique
     * @param typePizza Type de pizza commandé
     * @param quantite Quantité de pizzas dans la commande
     * @param adresseLivraison Adresse de livraison pour la commande
     * @param etat État actuel de la commande
     */
    public Commande(int numero, String typePizza, int quantite, String adresseLivraison, String etat) {
        this.numero = numero;
        this.typePizza = typePizza;
        this.quantite = quantite;
        this.adresseLivraison = adresseLivraison;
        this.etat = etat;
    }

    /**
     * Méthode pour obtenir le numéro de la commande.
     * @return Numéro de la commande
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Méthode pour définir le numéro de la commande.
     * @param numero Nouveau numéro de commande
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Méthode pour obtenir le type de pizza dans la commande.
     * @return Type de pizza commandé
     */
    public String getTypePizza() {
        return typePizza;
    }

    /**
     * Méthode pour définir le type de pizza dans la commande.
     * @param typePizza Nouveau type de pizza
     */
    public void setTypePizza(String typePizza) {
        this.typePizza = typePizza;
    }

    /**
     * Méthode pour obtenir la quantité de pizzas dans la commande.
     * @return Quantité de pizzas
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * Méthode pour définir la quantité de pizzas dans la commande.
     * @param quantite Nouvelle quantité de pizzas
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     * Méthode pour obtenir l'adresse de livraison de la commande.
     * @return Adresse de livraison
     */
    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    /**
     * Méthode pour définir l'adresse de livraison de la commande.
     * @param adresseLivraison Nouvelle adresse de livraison
     */
    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    /**
     * Méthode pour obtenir l'état actuel de la commande.
     * @return État de la commande
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Méthode pour définir l'état actuel de la commande.
     * @param etat Nouvel état de la commande
     */
    public void setEtat(String etat) {
        this.etat = etat;
    }
}
