package com.java.oops.inheritance;

public class StaticWIthInhertitance {

	public static void main(String[] args) {
		Child c = new Child();
		c.m2();
		c.m1();
	}
}

class Parent {

	static void m1() {
		System.out.println("Parent m1()");
	}
	void m2() {
		System.out.println("Parent m2()");
	}
}

class Child extends Parent {
//	static things dont take part in Inheritance
//	@Override
	static void m1() {
		System.out.println("Chile m1()");
	}

	@Override
	void m2() {
		System.out.println("Child m2()");

	}
}
