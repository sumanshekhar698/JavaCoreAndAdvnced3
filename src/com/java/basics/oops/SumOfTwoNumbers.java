package com.java.basics.oops;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// you are opening a resource

		System.out.println("Enetr 1st num");
		int numOne = sc.nextInt();
		System.out.println("Enetr 2nd num");

		int numTwo = sc.nextInt();
		System.out.println("SUM ==> " + (numOne + numTwo));

		sc.close();

		numOne = sc.nextInt();

	}

}
