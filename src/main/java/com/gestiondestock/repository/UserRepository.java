package com.gestiondestock.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.gestiondestock.entites.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

	
List<Users> findByUserName(String userName);
	
	@Modifying
	@Transactional
	@Query("UPDATE Users user set user.password = ?1 WHERE user.id = ?2")
	void changePWD(String password, Long id);
	public List<Users> findByuserName(String userName ); 
}
