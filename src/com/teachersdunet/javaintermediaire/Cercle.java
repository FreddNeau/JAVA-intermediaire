package com.teachersdunet.javaintermediaire;

public class Cercle implements Forme {

	protected int rayon = 4;
	
	@Override
	public double aire() {
				return Math.PI*rayon*rayon;
	}

}
