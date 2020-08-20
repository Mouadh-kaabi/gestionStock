package com.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondestock.entites.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {

	
}
