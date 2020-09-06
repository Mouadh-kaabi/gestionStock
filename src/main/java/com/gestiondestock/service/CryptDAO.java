package com.gestiondestock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CryptDAO {
	
	 @Autowired 
	 private BCryptPasswordEncoder bCryptPasswordEncoder;
	 
	 @Bean 
	  BCryptPasswordEncoder getBCPE() { 
		  
		  return new BCryptPasswordEncoder(); 
	  }
	 
	 public String encryption(String message) {
		 
		 return bCryptPasswordEncoder.encode(message);		 
	 }
	 

}
