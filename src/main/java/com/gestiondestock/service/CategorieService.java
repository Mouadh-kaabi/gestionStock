package com.gestiondestock.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gestiondestock.entites.Categorie;
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
	

	
	public void deleteCategorie(Long id) {
		Optional<Categorie> e= categorieRepository.findById(id);
		 if(e.isPresent())
		 {
			categorieRepository.deleteById(id); 
		 }
							
		
		
	}
	
	
	public List<Categorie> getAllCategorieDetails() {
		return categorieRepository.findAll(); 
	}
	
	
}
