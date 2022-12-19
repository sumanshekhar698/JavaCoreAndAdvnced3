package com.java.basics.oops;

import java.util.Arrays;

public class MainArraysOfBike {

	public static void main(String[] args) {

		Bike[] bikes = new Bike[5];
		System.out.println(Arrays.toString(bikes));

		for (int i = 0; i < bikes.length; i++) {
			bikes[i] = new Bike();
		}
		
		System.out.println(Arrays.toString(bikes));

	}

}
