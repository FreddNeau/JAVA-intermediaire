package com.teachersdunet.javaintermediaire;

import java.util.Scanner;

public class ExamenTest {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		Examen examen = new Examen();
		
		System.out.println("Entrer la matiere concernee : ");
		String matiere = clavier.nextLine();
		examen.afficherMessage(matiere);//afficher le contenu de la variable examen en utilisant la méthode créée dans Examen.java
		
		clavier.close();
	}

}
