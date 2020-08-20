package com.gestiondestock.rest;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestiondestock.repository.ProduitRepository;

public class ImageService {

	
	@Autowired  ServletContext context;
	@Autowired ProduitRepository produitRepository ;
}
