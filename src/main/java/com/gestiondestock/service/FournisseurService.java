package com.gestiondestock.service;

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
	
	
}
