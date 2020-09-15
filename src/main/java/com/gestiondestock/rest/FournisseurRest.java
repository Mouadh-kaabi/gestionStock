package com.gestiondestock.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("/{id}")
	public Fournisseur getFournisseur(@PathVariable (value="id") Long id) {
		return fournisseurService.getFournisseur(id);
	}

	@PostMapping("/inscrpition")
	public Fournisseur ajouterFournisseur(@RequestBody Fournisseur fr) {
		return fournisseurService.ajouterFournisseur(fr);
	}
	
	  @GetMapping("/all")
		public List<Fournisseur> ListFournisseur() {
			return fournisseurService.ListFournisseur();
		}
	  @PutMapping("/{id}")
		public Fournisseur updateFournisseur(@PathVariable(value="id") Long id, @RequestBody Fournisseur fournisseur) {
			return fournisseurService.updateFournisseur(id, fournisseur);
		}
	  @DeleteMapping("/{id}")
		public void deleteFournisseur(@PathVariable(value="id") Long id) {
			fournisseurService.deleteFournisseur(id);
		}
	

}
