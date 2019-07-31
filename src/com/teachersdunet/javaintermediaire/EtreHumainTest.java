package com.teachersdunet.javaintermediaire;

import java.util.ArrayList;

public class EtreHumainTest {

	public static void main(String[] args) {
		ArrayList<EtreHumain> tab = new ArrayList<EtreHumain>();
		tab.add(new Homme());
		tab.add(new Femme());
		tab.add(new Femme());
		tab.add(new Homme());
		
		for (EtreHumain etreHumain : tab) {
			etreHumain.uriner();
		}
		
	}

}
