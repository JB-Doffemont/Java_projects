package com.practice.designpattern.pizza;

public class Pizza implements PizzaInterface {

    private String nom;
    private String pate;
    private String sauce;
    private String garniture;
    private int prix;

    public Pizza() {}
    
    public PizzaBuilder creationBuilder() {
    	return new PizzaBuilder();
    }

    public static class PizzaBuilder {
        private String nom = "Non définit";
        private String pate = "Non définit";
        private String sauce = "Non définit";
        private String garniture = "Non définit";
        private int prix = 0;

        public PizzaBuilder choisirNom(String nom) {
            this.nom = nom;
            return this;
        }

        public PizzaBuilder choisirPate(String pate) {
            this.pate = pate;
            return this;
        }

        public PizzaBuilder choisirSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder choisirGarniture(String garniture) {
            this.garniture = garniture;
            return this;
        }

        public PizzaBuilder choisirPrix(int prix) {
            this.prix = prix;
            return this;
        }

        public Pizza build() {
            Pizza pizza = new Pizza();
            pizza.nom = nom;
            pizza.pate = pate;
            pizza.garniture = garniture;
            pizza.sauce = sauce;
            pizza.prix = prix;
            return pizza;
        }
    }

    public void cuire() {
        // Logique de cuisson
    }

    public void prepare() {
        // Logique de préparation
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPate() {
        return pate;
    }

    public void setPate(String pate) {
        this.pate = pate;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getGarniture() {
        return garniture;
    }

    public void setGarniture(String garniture) {
        this.garniture = garniture;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
