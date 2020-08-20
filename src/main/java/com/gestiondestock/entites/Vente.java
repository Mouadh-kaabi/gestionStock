package com.gestiondestock.entites;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vente {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id ; 
	private String nomClient ;
	private int phone ;
	private LocalDateTime dateVente ;
	private float ttc ; 
	private float tht;
	private float ttva;
	private String typePaiment ;
	private String etatPaiment ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public LocalDateTime getDateVente() {
		return dateVente;
	}
	public void setDateVente(LocalDateTime dateVente) {
		this.dateVente = dateVente;
	}
	public float getTtc() {
		return ttc;
	}
	public void setTtc(float ttc) {
		this.ttc = ttc;
	}
	public float getTht() {
		return tht;
	}
	public void setTht(float tht) {
		this.tht = tht;
	}
	public float getTtva() {
		return ttva;
	}
	public void setTtva(float ttva) {
		this.ttva = ttva;
	}
	public String getTypePaiment() {
		return typePaiment;
	}
	public void setTypePaiment(String typePaiment) {
		this.typePaiment = typePaiment;
	}
	public String getEtatPaiment() {
		return etatPaiment;
	}
	public void setEtatPaiment(String etatPaiment) {
		this.etatPaiment = etatPaiment;
	}
	public Vente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vente(String nomClient, int phone, LocalDateTime dateVente, float ttc, float tht, float ttva,
			String typePaiment, String etatPaiment) {
		super();
		this.nomClient = nomClient;
		this.phone = phone;
		this.dateVente = dateVente;
		this.ttc = ttc;
		this.tht = tht;
		this.ttva = ttva;
		this.typePaiment = typePaiment;
		this.etatPaiment = etatPaiment;
	}
	
	
}
