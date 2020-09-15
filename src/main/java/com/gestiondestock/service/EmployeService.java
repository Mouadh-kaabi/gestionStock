package com.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gestiondestock.entites.Employe;

import com.gestiondestock.repository.EmployeRepository;
import com.gestiondestock.repository.RoleRopository;

@Service
public class EmployeService {
	
	@Autowired
	EmployeRepository employeRepository;
	@Autowired
	RoleRopository roleRopository ;
	

	public Employe inscrpition(Employe e) {
		Optional<com.gestiondestock.entites.Role> r = roleRopository.findByRoleName("employe");
		e.setRole(r.get());
		return employeRepository.save(e);

	}
	public List<Employe> getAllEmployee() {
		return employeRepository.findAll(); 
	}
	
	public void deleteEmploye(Long id) {
		Optional<Employe> e= employeRepository.findById(id);
		 if(e.isPresent())
		 {
			employeRepository.deleteById(id); 
		 }
							
		
		
	}

}
