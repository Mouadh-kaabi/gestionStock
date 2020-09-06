package com.gestiondestock.security;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestiondestock.service.UsersService;


@Service
@Transactional
public class AcountServiceImpl implements AcountService{
	
	@Autowired
	private UsersService userService;

	@Override
	public List<com.gestiondestock.entites.Users> loadUserByUserName(String username) { 
		
		return userService.listUsers(username);
	}

	
	
	
 
}
