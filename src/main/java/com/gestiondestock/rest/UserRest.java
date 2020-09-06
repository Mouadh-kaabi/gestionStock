package com.gestiondestock.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestiondestock.entites.Users;
import com.gestiondestock.service.UsersService;



@RestController
@RequestMapping("/users")
public class UserRest {

	
	@Autowired
	com.gestiondestock.repository.UserRepository userRepository;
	@Autowired
	UsersService usersService;
	// list des users
	@GetMapping("/all")
	public List<com.gestiondestock.entites.Users> ListUser() {
		return usersService.ListUser();
	}
	
	@GetMapping("/{username}")
	public List<com.gestiondestock.entites.UserAuth> getUsers(@PathVariable String username) {
		List<com.gestiondestock.entites.UserAuth> lUsers = new ArrayList<com.gestiondestock.entites.UserAuth>();
		List<com.gestiondestock.entites.Users> user = userRepository.findByUserName(username);
		for (com.gestiondestock.entites.Users users : user) {
			com.gestiondestock.entites.UserAuth u = new com.gestiondestock.entites.UserAuth();
			u.setUserName(users.getUserName());
			u.setPassword(users.getPassword());
			u.setRole(users.getRole());
			lUsers.add(u);
		}
		return lUsers;
	}
	@GetMapping("/id/{userName}")
	public Long getUserId(@PathVariable String userName) {
		return usersService.getUserId(userName);
	}
	

	@PutMapping("/changePWD/{id}/{motDePasse}")
	public ResponseEntity<com.gestiondestock.entites.Users> changePWD(@PathVariable(value = "id") Long id, @PathVariable(value = "motDePasse") String motDePasse) {
		return usersService.changePWD(id, motDePasse);
	}
	@GetMapping("/user/{username}")
	public List<Users> findByusername(@PathVariable String userName) {
		return userRepository.findByuserName(userName);
	}
	
	
}
