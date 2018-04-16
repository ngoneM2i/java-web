package com.aiconoa.mytube;

public class User {
	
	private	String nom;
	private String prenom;
	
	
	public User(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
}
