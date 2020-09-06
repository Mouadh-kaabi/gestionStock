package com.gestiondestock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.gestiondestock.entites.Categorie;
import com.gestiondestock.entites.Produit;
import com.gestiondestock.repository.CategorieRepository;
import com.gestiondestock.repository.ProduitRepository;

@Service
public class ProduitService {

	@Autowired
	private ProduitRepository produitRepository;
	@Autowired 
	private CategorieRepository categorieRepository ;

	public ResponseEntity<Produit> ajouterProduit(Produit p) {
		
			Categorie categorie = categorieRepository.save(p.getCategorie());
			p.setCategorie(categorie);
			produitRepository.save(p);
			return new ResponseEntity<Produit>(p, HttpStatus.OK);	
		
		
	
	
	}

	// list des produits
	public List<Produit> ListProduit() {

		return this.produitRepository.findAll();
	}

	// affichage par id
	public Produit getProduit(Long id) {

		return produitRepository.findById(id).get();

	}

	
	// update produit
		public Produit updateProduit(Produit produit) {
			if (produit.getId() != 0) {
				Produit pr = produitRepository.findById(produit.getId()).get();
				if (pr != null) {
					//patient.setPassword(cryptDAO.encryption(patient.getPassword()));
					produitRepository.save(produit);
				}
			}
			return produit;
		}
}
