package com.teachersdunet.javaintermediaire;

public class Triangle implements Forme {
	protected int base = 4;
	protected int hauteur=2;
	
	@Override
	public double aire() {
		return (base * hauteur * 0.5);
	}
	
	
	
}
