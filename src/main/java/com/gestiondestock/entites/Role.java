package com.gestiondestock.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	@GeneratedValue (strategy = GenerationType.AUTO)
	@Id
	private Long idRole;

    private String roleName;

    private String description;
    
    public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String roleName, String description) {
		super();
		this.roleName = roleName;
		this.description = description;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public String getRoleName() {
		return roleName;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    
    
    
}
