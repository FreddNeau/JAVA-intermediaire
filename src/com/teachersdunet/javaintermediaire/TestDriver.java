package com.teachersdunet.javaintermediaire;

public class TestDriver {

	public static void main(String[] args) {
		A a = new A(34,"momo");
		A.B b = a.new B();
		A.C c = a.new C();
	}

}
