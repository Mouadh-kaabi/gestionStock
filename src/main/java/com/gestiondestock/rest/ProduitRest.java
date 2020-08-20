package com.gestiondestock.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondestock.entites.Produit;
import com.gestiondestock.service.ProduitService;

@RestController
@RequestMapping("/produit")
@CrossOrigin("http://localhost:4200")
public class ProduitRest {

	
	@Autowired 
	private ProduitService produitService ;
	
	
	@PostMapping("/ajouter")
	public Produit ajouterProduit(@RequestBody Produit p) {
		return produitService.ajouterProduit(p);
	}
	@GetMapping("/allproduit")
	public List<Produit> ListProduit() {
		return produitService.ListProduit();
	}
	@GetMapping("/allproduit/{id}")
	public Produit getProduit(@PathVariable Long id) {
		return produitService.getProduit(id);
	}
	
	@PutMapping("/update")
	public Produit updateProduit(@RequestBody Produit produit) {
		return produitService.updateProduit(produit);
	}
	
	
	
	
	
	
}
