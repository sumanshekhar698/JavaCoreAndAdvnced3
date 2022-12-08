package com.java.basics.oops;

public class Bike {

//	HAS
	// insatnce variables (object specific)
	String color;// every object has default value null
	String brand;
	int cc;
	float mileageOfTheBike;

//	DOES
	void ride() {
		System.out.println("The bike is beautiful and has a good mileage of" + mileageOfTheBike);
	}
}
