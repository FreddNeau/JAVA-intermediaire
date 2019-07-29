package com.teachersdunet.javaintermediaire;

import javax.swing.JOptionPane;

public class BoiteDialogTest {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Salut les amis!");
		
		//String nom =JOptionPane.showInputDialog("Quel est ton nom?");
		
		//String message = String.format("Salut %s. Java est cool, n'est-ce pas?", nom);
		
		
	String nombre1 =JOptionPane.showInputDialog("Entrer le premier nombre :");
	int nbre1 = Integer.parseInt(nombre1);
		
	String nombre2 =JOptionPane.showInputDialog("Entrer le deuxième nombre :");
	int nbre2 = Integer.parseInt(nombre2);
		int resultat = nbre1 +nbre2;
		 
		
		
		//JOptionPane.showInputDialog("Le resultat est : ", resultat);
		
		JOptionPane.showMessageDialog(null, resultat,"le resultat est : ",JOptionPane.INFORMATION_MESSAGE );
		 //JOptionPane.showMessageDialog(null, resultat, "le resultat est : ", resultat);
		
	}

}
