package com.teachersdunet.javaintermediaire;

public class TaskTest {

	public static void main(String[] args) {
		Task tache1 = new Task ("Faire un tutoriel", "Formation");
		Task tache2 = new Task ("Aller au cinéma","Cinéma");
		Task tache3 = new Task ("Dire Mamaiya à la fin de la vidéo", "Mamaiya");
		
		tache2.complete();
		
		System.out.println(tache1.title);
		System.out.println(tache1.description);
	}

}
