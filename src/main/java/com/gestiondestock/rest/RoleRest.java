package com.gestiondestock.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondestock.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleRest {

	@Autowired
	RoleService roleService ;
	
	@PostMapping("/add")
	public com.gestiondestock.entites.Role addRole(@RequestBody com.gestiondestock.entites.Role r) {
		return roleService.addRole(r);
	}
}
