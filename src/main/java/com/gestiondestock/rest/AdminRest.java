	package com.gestiondestock.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondestock.entites.Admin;
import com.gestiondestock.service.AdminService;


@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:4200")
public class AdminRest {

	
	@Autowired
	private AdminService adminService ; 
	
	//  ajouter Admin
	@PostMapping("/inscription")
	public Admin inscrpition(@RequestBody Admin ad) {
		return adminService.inscrpition(ad);
	}
	
	
}
