package com.gestiondestock.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondestock.entites.Admin;
import com.gestiondestock.entites.Employe;
import com.gestiondestock.repository.AdminRepository;
import com.gestiondestock.repository.EmployeRepository;
import com.gestiondestock.repository.RoleRopository;

@Service
public class EmployeService {
	
	@Autowired
	EmployeRepository employeRepository;
	@Autowired
	RoleRopository roleRopository ;
	@Autowired
	CryptDAO cryptDAO;
	

	public Employe inscrpition(Employe e) {
		Optional<com.gestiondestock.entites.Role> r = roleRopository.findByRoleName("employe");
		e.setRole(r.get());
		e.setPassword(cryptDAO.encryption(e.getPassword()));
		return employeRepository.save(e);

	}

}
