package com.teachersdunet.javaintermediaire;

public class Carre implements Forme {

	protected int cote;
	protected String nom;
	protected String nomFemme;

	public Carre(String nom, int cote) {
		this.nom = nom;
		this.cote = cote;
	}
	
	public Carre(String nom, int cote, String nomFemme) {
		this(nom,cote);
		this.nomFemme = nomFemme;
	}
	
	public double aire() {
		return cote * cote;
	}

}
