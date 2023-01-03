package com.java.oops.abstraction.interfaces.functional_interfaces;

public class Main {

	public static void main(String[] args) {

		Eagle eagle = new Eagle();
		eagle.fly();

		Bird peacock = new Bird() {

			@Override
			public void fly() {
				System.out.println("Peacocks dont fly high");

			}
		};
		peacock.fly();

		Bird hen = () -> {// lambda expression/fn
			System.out.println("Hens dont fly");
		};
		hen.fly();

	}

}

class Eagle implements Bird {

	@Override
	public void fly() {
		System.out.println("Eagle flyies high");

	}

}
