package com.gestiondestock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestiondestock.entites.Role;
import com.gestiondestock.repository.RoleRopository;

@Service
public class RoleService {

	
	@Autowired
	RoleRopository role ;
	
	public Role addRole(Role r) {
		role.save(r);
		return r;
	}
}
