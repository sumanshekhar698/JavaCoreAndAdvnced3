package com.java.basics.oops;

public class MainBike {

	public static void main(String[] args) {

//		int x=9;//Primitive variable

//		Integer a = new Integer(9);
		//Wrapper classes
		Integer a = 9;//Boxing AutoBoxing
		System.out.println(a++);
		System.out.println(a);

//		a.
		int x = a;//Auto Unboxing
		
		String name = "Yamaha";
		Bike b1 = new Bike();

		b1.ride();
		System.out.println(b1.color);
		b1.color = "Black";
		System.out.println(b1.color);
		System.out.println(b1.cc);

		b1 = null;
		System.gc();// manually invoking gc

		Bike b2 = new Bike();
		System.out.println(b2.color);// Maroon

		b1 = b2;
		System.out.println(b1.color);// Maroon

		b2 = null;
		System.out.println(b1.color);

		System.out.println(b1);// 182decdb
		System.out.println(b2);// null

//		x=7;
//		System.out.println(x);

	}

}
