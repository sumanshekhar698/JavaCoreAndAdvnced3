package com.java.basics.oops;

public class MainBike {

	public static void main(String[] args) {

		Bike b1 = new Bike();

		b1.ride();
		System.out.println(b1.color);
		b1.color = "Black";
		System.out.println(b1.color);

	}

}
