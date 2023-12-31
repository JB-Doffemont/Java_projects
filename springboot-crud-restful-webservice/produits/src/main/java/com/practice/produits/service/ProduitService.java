package com.practice.produits.service;

import java.util.List;

import com.practice.produits.dto.ProduitDTO;
import com.practice.produits.model.Categorie;
import com.practice.produits.model.Produit;

public interface ProduitService {
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	
	ProduitDTO saveProduit(ProduitDTO p);
	ProduitDTO getProduit(Long id);
	ProduitDTO updateProduit(ProduitDTO p);
	List<ProduitDTO> getAllProduits();
	
	List<Produit> findByNomProduit(String nom);
	List<Produit> findByNomProduitContains(String nom);
	List<Produit> findByNomPrix (String nom, Double prix);
	List<Produit> findByCategorie (Categorie categorie);
	List<Produit> findByCategorieIdCat(Long id);
	List<Produit> findByOrderByNomProduitAsc();
	List<Produit> trierProduitsNomsPrix();
	
	ProduitDTO convertEntityToDto (Produit produit);
	Produit convertDtoToEntity(ProduitDTO produitDto);
}
