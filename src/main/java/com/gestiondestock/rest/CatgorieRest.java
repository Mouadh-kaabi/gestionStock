package com.gestiondestock.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondestock.entites.Categorie;
import com.gestiondestock.service.CategorieService;

@RestController
@RequestMapping("/categorie")
@CrossOrigin("http://localhost:4200")
public class CatgorieRest {

	
	@Autowired
	CategorieService categorieService ;
	
	
	
	@PostMapping("/ajouter")
	public Categorie ajouterCategorie(@RequestBody Categorie cat) {
		return categorieService.ajouterCategorie(cat);
	}
	@GetMapping("/all")
	public List<Categorie> getAllCategorieDetails() {
		return categorieService.getAllCategorieDetails();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCategorie(@PathVariable(value="id") Long id) {
		categorieService.deleteCategorie(id);
	}
	
	
	
	
	
	
	
	
}
