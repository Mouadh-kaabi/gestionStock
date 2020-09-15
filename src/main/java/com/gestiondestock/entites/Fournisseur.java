package com.gestiondestock.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Fournisseur {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	
	private Long id;
	private String email;
	private String nom ;
	private int phone ; 
	private String address ;
	private String ville ; 
	private String codepostal;
	private String status ;
	private String catFournisseur ;
	private String rib ;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "produit_id",referencedColumnName = "id", nullable = false)
	private Produit produits;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getCatFournisseur() {
		return catFournisseur;
	}
	public void setCatFournisseur(String catFournisseur) {
		this.catFournisseur = catFournisseur;
	}
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public Fournisseur(String email, String nom, int phone, String address, String ville, String codepostal,
			String status, String catFournisseur, String rib) {
		super();
		this.email = email;
		this.nom = nom;
		this.phone = phone;
		this.address = address;
		this.ville = ville;
		this.codepostal = codepostal;
		this.status = status;
		this.catFournisseur = catFournisseur;
		this.rib = rib;
	}
	
	
	 
	
	
	
	
}
