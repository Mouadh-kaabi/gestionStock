package com.gestiondestock.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.gestiondestock.entites.Categorie;
import com.gestiondestock.entites.Produit;
import com.gestiondestock.repository.CategorieRepository;
import com.gestiondestock.repository.ProduitRepository;


@Service
public class CategorieService {

	
	@Autowired
	CategorieRepository categorieRepository ;
	@Autowired 
	ProduitRepository produitRepository ; 
	public Categorie ajouterCategorie(Categorie cat)
	{
		return categorieRepository.save(cat);
	}
	

	/*public ResponseEntity<Categorie> AjouterCategorie(Categorie categorie)  {
		Produit produit = null;
		if (categorie.getProduit() != null)
		{
			produit =	produitRepository.save(categorie.getProduit());
			categorie.setProduit(produit);
			categorieRepository.save(categorie);
			return new ResponseEntity<Categorie>(categorie, HttpStatus.OK);
		}
		else 
		{
			return new ResponseEntity<Categorie>(categorie, HttpStatus.NOT_FOUND);
		}
			
		
	}*/
	
	public List<Categorie> getAllCategorieDetails() {
		return categorieRepository.findAll(); 
	}
	
	/*public List<Categorie> getProduitCategorie(Long idProduit) {
		
		Optional<Produit> produit = produitRepository.findById(idProduit);
		
		if(produit.isPresent())
			return categorieRepository.findByProduit(produit.get());
		else
			return null;
	}*/
}
