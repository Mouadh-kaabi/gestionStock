package com.gestiondestock.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.gestiondestock.entites.Users;

@Service
public class UsersService {

	
	@Autowired
	com.gestiondestock.repository.UserRepository userRepo;

	
	// list des admins
		public List<Users> ListUser() {

			return this.userRepo.findAll();
		}
		
		
		public List<Users> listUsers(String userName)
		
		{
			return userRepo.findByuserName(userName);
		}
		
		public Long getUserId(String userName) {
			List<Users> users = userRepo.findByUserName(userName);
			if(users.size() == 1)
			{
				return users.get(0).getId();
			}
			else {
				return null;
			}
		}
		
		public ResponseEntity<Users> changePWD(Long id, String password) {

			Optional<Users> user = userRepo.findById(id);
			if(user.isPresent()) {
				userRepo.changePWD(password, id);
				user.get().setPassword(password);
				return new ResponseEntity<Users>(user.get(), HttpStatus.OK);
			}else {
				return new ResponseEntity<Users>(new Users(), HttpStatus.NOT_FOUND);
			}
		}
}
