package com.gestiondestock.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public class Users {
	

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
    private String email;
    private String password;
    
    @ManyToOne
   	@JoinColumn (name="idrole", referencedColumnName = "idRole")
   	private Role role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String userName, String email, String password, Role role) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.role = role;
	}
    
	
    
	
}
