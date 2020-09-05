package com.gestiondestock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondestock.entites.Fournisseur;
import com.gestiondestock.repository.FournisseurRepository;

@Service
public class FournisseurService {

	
	@Autowired
	private FournisseurRepository fournisseurRepository ;
	
	public Fournisseur ajouterFournisseur(Fournisseur fr )
	{
		return fournisseurRepository.save(fr);
	}
	
	public List<Fournisseur>ListFournisseur()
	{
		return fournisseurRepository.findAll();
	}
	public Fournisseur updateFournisseur(Long id, Fournisseur fournisseur) {
		if (fournisseurRepository.findById(id).isPresent()) {
			Fournisseur f = fournisseurRepository.findById(id).get();
			f.setNom(fournisseur.getNom());
			f.setPhone(fournisseur.getPhone());
			f.setAddress(fournisseur.getAddress());
			f.setCatFournisseur(fournisseur.getCatFournisseur());
			f.setCodepostal(fournisseur.getCodepostal());
			f.setEmail(fournisseur.getEmail());
			f.setRib(fournisseur.getRib());
			f.setStatus(fournisseur.getStatus());
			f.setVille(fournisseur.getVille());
			fournisseurRepository.save(f);

			return f;

		} else {
			return null;

		}
	}
	
}
