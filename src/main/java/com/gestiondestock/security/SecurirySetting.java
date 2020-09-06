package com.gestiondestock.security;

public interface SecurirySetting {
	
	
	public static final String  JWT_HEADER_NAME= "Authorization";
	
	public static final String  SECRET = "gestion_stock";
	
	public static final long EXPIRATION = 10 * 24 * 3600* 1000;
	
	public static final String HEADER_PREFIX ="Gestionstock";

	
}
