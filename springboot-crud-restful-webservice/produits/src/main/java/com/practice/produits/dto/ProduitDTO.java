package com.practice.produits.dto;

import java.util.Date;

import com.practice.produits.model.Categorie;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProduitDTO {

	private Long idProduit;
	private String nomProduit;
	private Double prixProduit;
	private Date dateCreation;
	
	@ManyToOne 
	private Categorie categorie;
}
