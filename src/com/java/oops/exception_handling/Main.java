package com.java.oops.exception_handling;

public class Main {

	static int counter = 0;

	public static void main(String[] args) {

		System.out.println("START");
		int[] num = { 4, 4, 234, 456, 7 };

		// Unchecked Exception
		try {
			System.out.println(num[num.length]);// ArrayIndexOutOfBoundsException
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
			System.out.println(e);
			e.printStackTrace();
		}
//		call();
		System.out.println("STOP");

	}

	static void call() {
		++counter;
		System.out.println("calling ==> " + counter);// Error => StackOverflowError
		call();
	}

}
