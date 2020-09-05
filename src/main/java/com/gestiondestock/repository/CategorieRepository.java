package com.gestiondestock.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestiondestock.entites.Categorie;
import com.gestiondestock.entites.Produit;
import com.gestiondestock.entites.Role;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {


}
