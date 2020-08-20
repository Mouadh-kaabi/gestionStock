package com.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondestock.entites.Produit;


public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
	

}
