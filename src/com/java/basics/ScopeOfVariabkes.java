package com.java.basics;

public class ScopeOfVariabkes {

	public static void main(String[] args) {

		int x = 9;
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		x = 88;

		int i = 90;
//		int x =897;
		System.out.println(i);

	}

}
