package com.gestiondestock.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestiondestock.entites.Role;

public interface RoleRopository extends JpaRepository<Role, Long> {

	public Optional<Role> findByRoleName(String roleName);
}
