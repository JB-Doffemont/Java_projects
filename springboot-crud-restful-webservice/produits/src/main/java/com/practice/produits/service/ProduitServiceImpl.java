package com.practice.produits.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.produits.dto.ProduitDTO;
import com.practice.produits.model.Categorie;
import com.practice.produits.model.Produit;
import com.practice.produits.repository.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {

	@Autowired
	ProduitRepository produitRepository;

	@Override
	public ProduitDTO saveProduit(Produit p) {
		return convertEntityToDto(produitRepository.save(p));
	}

	@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
	}

	@Override
	public ProduitDTO getProduit(Long id) {
		return convertEntityToDto(produitRepository.findById(id).get());
	}

	@Override
	public List<ProduitDTO> getAllProduits() {
		List<Produit> prods = produitRepository.findAll();
		List<ProduitDTO> listProdDto = new ArrayList<>(prods.size());
		for (Produit p : prods)
			listProdDto.add(convertEntityToDto(p));
		return listProdDto;
	}

	@Override
	public List<Produit> findByNomProduit(String nom) {
		return produitRepository.findByNomProduit(nom);
	}

	@Override
	public List<Produit> findByNomProduitContains(String nom) {
		return produitRepository.findByNomProduitContains(nom);
	}

	@Override
	public List<Produit> findByNomPrix(String nom, Double prix) {
		return produitRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Produit> findByCategorie(Categorie categorie) {
		return produitRepository.findByCategorie(categorie);
	}

	@Override
	public List<Produit> findByCategorieIdCat(Long id) {
		return produitRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<Produit> findByOrderByNomProduitAsc() {

		return produitRepository.findByOrderByNomProduitAsc();
	}

	@Override
	public List<Produit> trierProduitsNomsPrix() {
		return produitRepository.trierProduitsNomsPrix();
	}

	@Override
	public ProduitDTO convertEntityToDto(Produit produit) {

		return ProduitDTO.builder().idProduit(produit.getIdProduit()).nomProduit(produit.getNomProduit())
				.prixProduit(produit.getPrixProduit()).dateCreation(produit.getDateCreation())
				.categorie(produit.getCategorie()).build();
	}

}
