package com.teachersdunet.javaintermediaire;

public class Task {
	public String title;
	public String description;
	public boolean completed = false;
	 
	
	public Task(String title, String description ) {
		this.title = title;
		this.description = description;
	}
	
	public void complete() { //m�thode qui permet de compl�ter la tache
		completed = true;
		}
	
}
