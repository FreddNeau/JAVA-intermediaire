package com.teachersdunet.javaintermediaire;

public class HeritageTest {

	public static void main(String[] args) {
		Forme[] tab = new Forme[3];
		tab[0] = new Carre("toto",2);
		tab[1] = new Triangle();
		tab[2] = new Cercle();
		
		for (Forme forme : tab) {
			System.out.println(forme.aire());
		}
	}

}












//TP Compte bancaire
/*CompteBancaire cb = new CompteBancaire("Honore Hounwanou", 2500);
String test = "toto " + cb;
System.out.println(test);
System.out.println(Integer.valueOf("44").getClass());*/

//TP interface Vidéo32
/*Chat chat = new Chat();
chat.communiquer();
Chien chien = new Chien();
chien.communiquer();*/