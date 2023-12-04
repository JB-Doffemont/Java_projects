package com.practice.produits.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.practice.produits.dto.ProduitDTO;
import com.practice.produits.model.Produit;
import com.practice.produits.service.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {

	@Autowired
	ProduitService produitService;

	@GetMapping
	public List<ProduitDTO> getAllProduits() {
		return produitService.getAllProduits();
	}

	@GetMapping("/{id}")
	public ProduitDTO getProduitById(@PathVariable("id") Long id) {
		return produitService.getProduit(id);
	}

	@PostMapping
	public ProduitDTO createProduit(@RequestBody Produit produit) {
		return produitService.saveProduit(produit);
	}

	@PutMapping
	public Produit updateProduit(@RequestBody Produit produit) {
		return produitService.updateProduit(produit);
	}

	@DeleteMapping("/{id}")
	public void deleteProduit(@PathVariable("id") Long id) {
		produitService.deleteProduitById(id);
	}
	
	@GetMapping("/prodscat/{idCat}")
	public List<Produit> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
	return produitService.findByCategorieIdCat(idCat);
	}
}
