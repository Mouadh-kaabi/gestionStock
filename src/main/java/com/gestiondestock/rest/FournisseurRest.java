package com.gestiondestock.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondestock.entites.Fournisseur;
import com.gestiondestock.service.FournisseurService;

@RestController
@RequestMapping("/client")
@CrossOrigin("http://localhost:4200")
public class FournisseurRest {
	
	@Autowired
	private FournisseurService fournisseurService ;

	
	@PostMapping("/inscrpition")
	public Fournisseur ajouterFournisseur(@RequestBody Fournisseur fr) {
		return fournisseurService.ajouterFournisseur(fr);
	}
	
	

}
