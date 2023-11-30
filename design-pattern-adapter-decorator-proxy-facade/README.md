# Bibliothèque en Ligne avec Patterns Structurels

Bienvenue sur le projet de bibliothèque en ligne, où les patterns structurels (Adapter, Decorator, Proxy, et Facade)
sont mis en œuvre pour résoudre des défis de développement logiciel courants.
Ce TP simule la conception d'un système de bibliothèque en ligne et vous guide à travers l'implémentation de ces patterns
pour résoudre des problématiques spécifiques.

## Contexte du Projet

Ce projet vise à simuler la conception d'un système de bibliothèque en ligne.
L'objectif est de permettre aux utilisateurs de parcourir, prévisualiser et acheter des livres tout en gérant les aspects physiques des exemplaires
via un système de prêt.

## Design Patterns Implémentés

### 1. Adapter Pattern

#### 1.1 OldBookStore

- La classe `OldBookStore` est fournie avec une méthode `getBook(string title)` qui retourne un objet `Book` avec des propriétés `title` et `price`.
L'Adapter Pattern est utilisé pour rendre cette classe compatible avec la nouvelle interface `IBookStore`, qui utilise la méthode `fetchBook(string title)`.

### 2. Decorator Pattern

#### 2.1 LibraryBookDecorator

- Le pattern Decorator est utilisé pour ajouter dynamiquement des fonctionnalités à un objet `Book` sans modifier sa classe d'origine.
Des fonctionnalités telles que `loanOut()` ou `returnBook()` sont ajoutées pour gérer les exemplaires physiques de la bibliothèque.

### 3. Proxy Pattern

#### 3.1 ProxyBookAccess

- Le pattern Proxy est utilisé pour contrôler l'accès aux livres. Les utilisateurs doivent acheter le livre pour accéder à la lecture complète.
Le ProxyBookAccess permet de vérifier si l'utilisateur a acheté le livre avant d'autoriser l'accès complet.

### 4. Facade Pattern

#### 4.1 LibraryFacade

- Le pattern Facade est utilisé pour simplifier l'API de gestion des livres. La classe `LibraryFacade` offre une interface simplifiée aux clients,
cachant la complexité d'implémentation, comme la gestion des livres, des achats, et l'accès aux livres physiques/numériques.

