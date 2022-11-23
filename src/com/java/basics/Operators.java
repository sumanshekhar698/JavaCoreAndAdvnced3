package com.java.basics;

public class Operators {

	public static void main(String[] args) {

//		Unary Operators

//		Increment-Decrement Iprators
		int x = 9;
		x++;// x=x+1 = 10
		System.out.println(++x);// 11 surya
		System.out.println(x);// 11
		// 11
		// 10

//		Comparison Operator == <  >  <=  >= != >> they return boolean value
		if (x == 11)
			System.out.println("EQUAL");

//		Logical operator && || !
//		Bitwise

		System.out.println(8 & 9);
		System.out.println(9 | 9);
		System.out.println(9 ^ 9);

		System.out.println(8 << 3);// 8 * 2 * 2 *2
		System.out.println(8 >> 3);// 8 / 2 /2 /2

	}

}
