package com.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondestock.entites.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

}
