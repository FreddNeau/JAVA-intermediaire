package com.teachersdunet.javaintermediaire;

public class Task {
	public String title;
	public String description;
	public boolean completed = false;
	 
	
	public Task(String title, String description ) {
		this.title = title;
		this.description = description;
	}
	
	public void complete() { //méthode qui permet de compléter la tache
		completed = true;
		}
	
}
