package com.gestiondestock.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scategorie {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id ;
	private String code ;
	private String code_catg ;
	private String libelle ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	
	
	public String getCode_catg() {
		return code_catg;
	}
	public void setCode_catg(String code_catg) {
		this.code_catg = code_catg;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Scategorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Scategorie(String code, String code_catg, String libelle) {
		super();
		this.code = code;
		this.code_catg = code_catg;
		this.libelle = libelle;
	}
	
	
	
	
}
