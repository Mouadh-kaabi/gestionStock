package com.gestiondestock.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondestock.entites.Employe;
import com.gestiondestock.service.EmployeService;

@RestController
@RequestMapping("/employe")
@CrossOrigin("http://localhost:4200")
public class EmployeRest {

	@Autowired
	EmployeService employeService ;

//  ajouter Employe
	@PostMapping("/inscription")
	public Employe inscrpition(@RequestBody Employe e) {
		return employeService.inscrpition(e);
	}
	
	
	
}
