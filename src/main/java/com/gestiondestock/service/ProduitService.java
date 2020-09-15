package com.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondestock.entites.Produit;
import com.gestiondestock.repository.ProduitRepository;

@Service
public class ProduitService {

	@Autowired
	private ProduitRepository produitRepository;

	public Produit ajouterProduit(Produit p) {
		return produitRepository.save(p);
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
		
		
		public void deleteProduit(Long id) {
			Optional<Produit> e= produitRepository.findById(id);
			 if(e.isPresent())
			 {
				produitRepository.deleteById(id); 
			 }
		}
}
