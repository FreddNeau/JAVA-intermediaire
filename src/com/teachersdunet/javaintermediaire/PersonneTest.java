package com.teachersdunet.javaintermediaire;

public class PersonneTest {

	public static void main(String[] args) {
		Personne p1 = new Personne("Hounwanou", "Honore");
		Personne p2 = new Personne("Toto", "Petit");
		System.out.println(p2.full_title("Je m'appelle"));
		//System.out.println(Personne.getNombreTotalDePersonnes());
		//p1.setAge(45);
		//System.out.println(p1.getAge());
	}

}
