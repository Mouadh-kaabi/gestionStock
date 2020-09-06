package com.gestiondestock.security;

import java.util.List;



public interface AcountService {
	
	public List<com.gestiondestock.entites.Users> loadUserByUserName(String username);
}
