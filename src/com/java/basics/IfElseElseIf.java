package com.java.basics;

public class IfElseElseIf {

	public static void main(String[] args) {

		// if - else if-else
		int x = 5;
		if (x == 5) {
			System.out.println("A");
			x++;
		}

		if (false) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

		System.out.println(x);// 6

	}

}
