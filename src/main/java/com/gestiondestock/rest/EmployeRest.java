package com.gestiondestock.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/all")
	public List<Employe> getAllEmploye() {
		return employeService.getAllEmployee();
	}
	@DeleteMapping("/delete/{id}")
	public void deleteEmploye(@PathVariable(value="id") Long id) {
		employeService.deleteEmploye(id);
	}
	
	
	
}
