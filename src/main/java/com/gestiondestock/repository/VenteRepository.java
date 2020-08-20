package com.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondestock.entites.Vente;

public interface VenteRepository extends JpaRepository<Vente, Long> {

}
