package com.java.basics.oops;

public class Bike {

//	HAS
	// instance variables (object specific)
	String color = "Maroon";// every object has default value null
	String brand;//null
	int cc;
	float mileageOfTheBike;

//	DOES
	void ride() {
		System.out.println("The bike is beautiful and has a good mileage of" + mileageOfTheBike);
	}
}
