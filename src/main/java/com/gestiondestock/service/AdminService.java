	package com.gestiondestock.service;

import java.util.Optional;

import javax.management.relation.RoleResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestiondestock.entites.Admin;
import com.gestiondestock.repository.AdminRepository;
import com.gestiondestock.repository.RoleRopository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	@Autowired
	RoleRopository roleRopository ;
	@Autowired
	CryptDAO cryptDAO;

	public Admin inscrpition(Admin ad) {
		Optional<com.gestiondestock.entites.Role> r = roleRopository.findByRoleName("admin");
		ad.setRole(r.get());
		ad.setPassword(cryptDAO.encryption(ad.getPassword()));
		return adminRepository.save(ad);

	}
}
