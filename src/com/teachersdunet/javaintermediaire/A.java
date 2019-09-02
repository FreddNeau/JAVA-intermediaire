package com.teachersdunet.javaintermediaire;

public class A {
	private int att1;
	private String att2;

	public A(int att1, String att2) {
		this.att1 = att1;
		this.att2 = att2;

		new B().rire();

	}

	protected class B extends C implements D{
		public B() {
			super();
			System.out.printf("att1 vaut %d et att2 vaut %s.", att1, att2);
		}

		@Override
		public void rire() {
			System.out.println("Je ris");
			
		}
	}
		
	class C{
		public C() {
			System.out.println("Je suis le constructeur de C.");
		}
	}
	
}
