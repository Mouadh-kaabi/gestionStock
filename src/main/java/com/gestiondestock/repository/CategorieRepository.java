package com.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondestock.entites.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
