package com.gestiondestock.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id ; 
	private String nom ; 
	private int prixunitaire ; 
	private int quantite ;
	private String seuile;
	private int  tva ;
	private String picture;
	private boolean etats ;
	private Date datePrix;
	private Date dateProduit ;
	
	
	@OneToMany(mappedBy = "produit", fetch = FetchType.EAGER)
    @JsonIgnoreProperties("produit")
    private List<Categorie> categories = new ArrayList<Categorie>();
	
	
	public List<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(List<Categorie> categories) {
		this.categories = categories;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public boolean isEtats() {
		return etats;
	}
	public void setEtats(boolean etats) {
		this.etats = etats;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrixunitaire() {
		return prixunitaire;
	}
	public void setPrixunitaire(int prixunitaire) {
		this.prixunitaire = prixunitaire;
	}
	
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	

	public Date getDatePrix() {
		return datePrix;
	}
	public void setDatePrix(Date datePrix) {
		this.datePrix = datePrix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getSeuile() {
		return seuile;
	}
	public void setSeuile(String seuile) {
		this.seuile = seuile;
	}
	public int getTva() {
		return tva;
	}
	public void setTva(int tva) {
		this.tva = tva;
	}
	
	
	public Date getDateProduit() {
		return dateProduit;
	}
	public void setDateProduit(Date dateProduit) {
		this.dateProduit = dateProduit;
	}
	
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String nom, int prixunitaire, int quantite, String seuile, int tva, String picture, boolean etats) {
		super();
		this.nom = nom;
		this.prixunitaire = prixunitaire;
		this.quantite = quantite;
		this.seuile = seuile;
		this.tva = tva;
		this.picture = picture;
		this.etats = etats;
	}
	
	

}
