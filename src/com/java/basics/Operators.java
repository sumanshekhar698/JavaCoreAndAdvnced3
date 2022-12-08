package com.java.basics;

public class Operators {

	public static void main(String[] args) {

//		Assingment Operator
		int x = 9;
//		Unary Operators

//		Increment-Decrement Oprators

		x++;// x=x+1 = 10
		System.out.println(++x);// 11 surya
		System.out.println(x);// 11
		// 11
		// 10

		x += 1;
		x *= 2;// x =x *2

//		Comparison Operator == <  >  <=  >= !=  they return boolean value
		if (x == 24)
			System.out.println("EQUAL");

//		Logical operator && || ! not

		x *= 3;
		x++;
//Fira Code
		if (x > 50 && x % 2 != 0)
			System.out.println("YAYY");
		// Bitwise

//		& | ^

		System.out.println(86 & 99);
		System.out.println(9 | 9);
		System.out.println(9 ^ 9);// 0

		System.out.println(8 << 4);// 8 * 2 * 2 *2
		System.out.println(8 >> 3);// 8 / 2 /2 /2

	}

}
