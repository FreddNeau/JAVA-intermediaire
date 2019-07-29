package com.teachersdunet.javaintermediaire;

public class Personne {
	private String nom;
	private String prenom;
	private int age;

	public final static int NOMBRE_MAX_OREILLES = 2; 
	
	static int nombreTotalDePersonnes = 0;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		nombreTotalDePersonnes++;
	}

	public String full_title(String debut) {
		return String.format("%s %s %s", debut, nom, prenom);
	}
	
	
	public String full_title() {
		return String.format("Je suis %s %s", nom,prenom);
	}
	
	public static int getNombreTotalDePersonnes() {
		return nombreTotalDePersonnes;
	}
	
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	public void setAge(int age) {
		if (age < 15) {
			System.out.println("Interdit au moins de 15 ans");
		} else {
			this.age = age;
		}
	}
	public int getAge() {
		return this.age;
	}
	
}
