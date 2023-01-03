package com.java.oops.abstraction.interfaces.functional_interfaces;

@FunctionalInterface
public interface Bird {// So any interface which has only a single *abstract method is known as
						// Functional interface

	void fly();

	default void eat() {
		System.out.println("eatinmg grain");

	}

}
