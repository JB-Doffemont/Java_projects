package com.practice.produits.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.practice.produits.model.Categorie;
import com.practice.produits.model.Produit;

/**
 * Interface définissant les opérations du référentiel pour l'entité de type
 * 'Produit'. Étend JpaRepository de Spring Data JPA, fournissant des méthodes
 * CRUD prêtes à l'emploi. Il est attendu que l'entité 'Produit' ait un
 * identifiant de type Long.
 */
@RepositoryRestResource(path = "rest")
public interface ProduitRepository extends JpaRepository<Produit, Long> {

	List<Produit> findByNomProduit(String nom);

	List<Produit> findByNomProduitContains(String nom);

//	@Query("select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2")
//	List<Produit> findByNomPrix(String nom, Double prix);

	@Query("select p from Produit p where p.nomProduit like %:nom and p.prixProduit > :prix")
	List<Produit> findByNomPrix(@Param("nom") String nom, @Param("prix") Double prix);

	@Query("select p from Produit p where p.categorie = ?1")
	List<Produit> findByCategorie(Categorie categorie);

	List<Produit> findByCategorieIdCat(Long id);

	List<Produit> findByOrderByNomProduitAsc();
	
	@Query("select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC")
	List<Produit> trierProduitsNomsPrix ();
}
