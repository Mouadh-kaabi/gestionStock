package com.gestiondestock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondestock.entites.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
