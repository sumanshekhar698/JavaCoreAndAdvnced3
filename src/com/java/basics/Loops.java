package com.java.basics;

public class Loops {// follows Pascal convention ForLoopAndWhileLoop

	public static void main(String[] args) {// method

		final float VALUE_OF_PIE = 3.14159f;

//		Local Variable
//		Rules for a variable name
//		1. var name cannot be reserved words
//		2. Should not start with a number
//		3. Underscore, $ is possible for var name , hyphen is not
//		4. There is not length limit for variable

//		Conventions
//		1. Your variable name should be meaningful
//		2. Follow camelCase for variable name and method names
//		3. We follow capital snake for constant name in Java

		float value_of_pie = 3.14159f;// snake case is popular in Python
		float valueOfThePie = 3.14159f;// camel case is popular in Java
		long populationOfIndia = 1_413_122_021;
		double valueOfExponent = 2.718_281_828_459_045;

//		VALUE_OF_PIE = 0; //final variables cannot be change
		value_of_pie = 0;
		int num_1 = 8;
		int m = 10;// declaring and in initialising
		int y = 0;// declaring
		System.out.println(y);

		int i;
//		SCOPE of Variables
		for (i = 1; i <= 10; i++) {
			int num = 9;
			System.out.print(i * i + " ");
		}
//		System.out.println(num);
		System.out.println(i);

		System.out.println(i);
		int x = 1;
		while (x <= 20) {
			System.out.print(x * x + " ");
			x++;
		}

		do {
			System.out.println("EXECUTED");
		} while (false);

		/*
		 * for (;;) { System.out.println(true);
		 * 
		 * }
		 */

		for (int j = 0; j < 20; j++) {
			if (j == 11) {
//				break;
				continue;
			}
			System.out.println("primnting " + j);
		}
		
//		System.out.println(j);

	}

}
