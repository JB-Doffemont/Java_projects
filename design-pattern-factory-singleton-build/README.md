# Projet de Gestion des Commandes de Pizzas

Bienvenue sur mon projet de gestion des commandes pour une entreprise de livraison de pizzas en ligne ! Ce projet met en œuvre plusieurs Design Patterns,
notamment le Factory Pattern, le Singleton Pattern, et le Builder Pattern, pour créer et gérer efficacement différentes sortes de pizzas.

## Contexte du Projet

Je suis ravi de partager ce projet dans lequel j'ai été chargé de mettre en place une partie du système de gestion des commandes de pizzas
pour une entreprise de livraison de pizzas en ligne.
L'objectif était de créer un système simple permettant de créer différentes sortes de pizzas tout en gérant la création de ces objets pizzas de manière optimisée
et organisée.

## Design Patterns Implémentés

### 1. Factory Pattern

#### 1.1 Classes de Pizzas

- J'ai créé des classes pour deux ou trois types de pizzas différents, telles que `PizzaFromage` et `PizzaVegetarienne`.
 J'ai utilisé une classe de base `Pizza` avec les attributs nécessaires.

#### 1.2 PizzaFactory

- J'ai implémenté une classe `PizzaFactory` avec une méthode `createPizza(type)` pour créer une instance de la pizza correspondante selon le type fourni.
 Le code illustre comment la Factory facilite la création des objets en cachant la logique de création et en fournissant une interface commune.

### 2. Singleton Pattern

#### 2.1 CommandeManager

- J'ai implémenté la classe `CommandeManager` en utilisant le pattern Singleton pour garantir une seule instance de la classe.
 Cette instance unique peut être utilisée pour ajouter/gérer/supprimer des commandes.

Bonus : J'ai porté une attention particulière à la gestion des ressources et à la concurrence pour assurer une utilisation sûre dans un environnement multithread.

### 3. Builder Pattern

#### 3.1 Classe Pizza

- J'ai créé la classe `Pizza` avec plusieurs attributs tels que pâte, sauce, garnitures, etc.

#### 3.2 PizzaBuilder

- J'ai implémenté un `PizzaBuilder` pour construire une pizza étape par étape en fournissant une interface fluide (fluent interface).

#### 3.3 Création de Pizzas

- J'ai utilisé mon `PizzaBuilder` pour créer différentes pizzas avec différentes combinaisons de garnitures de manière ordonnée et claire.
 Ainsi, à la fin de cet exercice, je peux au choix construire des pizzas "toutes prêtes" grâce aux factories ou bien "sur mesure" via le builder.

Consigne : Une fluent interface permet une chaîne de méthodes modifiant l'état de l'instance et retournant à chaque fois l'instance elle-même,
facilitant des modifications en chaîne.

---

