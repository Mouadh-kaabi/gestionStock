package com.gestiondestock.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Categorie {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id ;
	private String code ;
	private String libelle ;
	
	
	
	@ManyToOne
	@JoinColumn(name = "idproduit", referencedColumnName = "id")
	private Produit produit;
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
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Categorie(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
