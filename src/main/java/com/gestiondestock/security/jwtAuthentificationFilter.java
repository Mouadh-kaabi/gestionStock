package com.gestiondestock.security;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager; 
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException; 
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gestiondestock.entites.Users;

 

public class jwtAuthentificationFilter extends UsernamePasswordAuthenticationFilter {
	private AuthenticationManager  authenticationManager;
	 
	public jwtAuthentificationFilter(AuthenticationManager authenticationManager) {
		super();
		this.authenticationManager = authenticationManager;
	}
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
		try {

			Users user = new ObjectMapper().readValue(request.getInputStream(), Users.class);
			return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword()));
		}catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
		User user = (User) authResult.getPrincipal();
		List<String> roles = new ArrayList<>(); 
		
		authResult.getAuthorities().forEach(a->{
			roles.add(a.getAuthority());
		});
		
		String jwt = JWT.create()
				
				// Preparation de Tocken
				.withIssuer(request.getRequestURI())  
				.withSubject(user.getUsername()) // nom d'utilisateur
				.withArrayClaim("role", roles.toArray(new String[roles.size()])) // les roles
				.withExpiresAt(new Date(System.currentTimeMillis() + SecurirySetting.EXPIRATION)) // date d'expiration de json web tocken
				.sign(Algorithm.HMAC256(SecurirySetting.SECRET)); // sucret
		
		// generation  de Token
		response.addHeader(SecurirySetting.JWT_HEADER_NAME,jwt);
		
		System.out.println("=========================================");
		System.out.println("votre Token JWT est  " + jwt);
		
	}
		
 
 
	
}
