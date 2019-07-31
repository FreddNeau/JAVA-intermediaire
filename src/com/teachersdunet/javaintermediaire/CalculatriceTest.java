package com.teachersdunet.javaintermediaire;

public class CalculatriceTest {

	public static void main(String[] args) {
		Calculatrice calculatrice = new Calculatrice();
		calculatrice.additionner(6, 6);
		calculatrice.soustraire(2);
		calculatrice.additionner(2, 3, 4);
		calculatrice.multiplier(2, 2);
		System.out.println(calculatrice.getResultat());

	}

}
