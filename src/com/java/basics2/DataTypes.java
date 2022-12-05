package com.java.basics2;

public class DataTypes {

	public static void main(String[] args) {

//		data types
//		numerical data

//		integer 2s complement
		byte a = 7;
		short b = 8;
		int c = 88888;
		long d = 87l;// long is 8 bytes

//		decimal numbers IEEE format
		float pi = 3.14159f;// 4 bytes
		double pi_2 = 3.14159265359;

		a = (byte) c;// forceful
		System.out.println(a);

		System.out.println(88888 % 256);

//		c = d;
		pi = d;

//		boolean

		boolean isSleeping = false;
		isSleeping = true;

		// char data
		char letterS = 'S';
		char letterSmallS = 's';

		System.out.println((int) letterS);

		char rupee = '₹';
		System.out.println(rupee);
		
		System.out.println((int)rupee);

	}

}
//-128 128