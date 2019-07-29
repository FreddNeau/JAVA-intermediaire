package com.teachersdunet.javaintermediaire;

//import static java.lang.Math.*;


public class Test {

	/*public static void main(String[] args) {
		System.out.println(abs(-34));
		System.out.println(cos(0));
		System.out.println(sin(0));
		System.out.println(PI);
	}

	/*
	 * public static int abs(int value) { if(value >=0) { return value; } else {
	 * return -value; }
	 */
	
	public static void main(String[] args) {
		Lampe lampe = new Lampe(false);
		Interrupteur interrupteur = new Interrupteur(lampe);
		
		System.out.println(lampe.estAllumee()); //false
		System.out.println(interrupteur.getPosition()); //off
		
		interrupteur.changerPosition();
		
		System.out.println(lampe.estAllumee()); //true
		System.out.println(interrupteur.getPosition()); //on
		
		interrupteur.changerPosition();
		
		System.out.println(lampe.estAllumee()); //false
		System.out.println(interrupteur.getPosition()); //off
		
		}

}
