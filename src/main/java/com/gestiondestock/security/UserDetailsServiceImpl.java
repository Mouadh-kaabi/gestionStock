package com.gestiondestock.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private AcountService acountService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {	
		List<com.gestiondestock.entites.Users> lu = acountService.loadUserByUserName(username);
		System.out.println("okkkk _____ UserDetails");
		if(lu == null) throw new UsernameNotFoundException("Utilisateur n'exist pas ");	
		for (com.gestiondestock.entites.Users users : lu) {
			System.out.println("List users not null");
			if (users.getUserName().equals(username)) {
				System.out.println("=========================================");
				System.out.println("le role de l'utilisateur est " + users.getRole().getRoleName());
				System.out.println("le nom d'utilisateur est " + users.getUserName());
				System.out.println("Mot de passe  d'utilisateur est " + users.getPassword());
				System.out.println("=========================================");
				Collection<GrantedAuthority> authority = new ArrayList<>();
				authority.add(new SimpleGrantedAuthority(users.getRole().getRoleName()));
				return new User( users.getUserName(), users.getPassword(),authority); 
			}
		}
		
		System.out.println("List users is null");
		return null;

	}
}
