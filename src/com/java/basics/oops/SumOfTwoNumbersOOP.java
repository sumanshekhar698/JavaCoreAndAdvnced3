package com.java.basics.oops;

import java.util.Scanner;

public class SumOfTwoNumbersOOP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// you are opening a resource

		System.out.println("Enetr 1st num");
		Integer numOne = sc.nextInt();
		System.out.println("Enetr 2nd num");

		Integer numTwo = sc.nextInt();
		System.out.println("SUM ==> " + (numOne + numTwo));

		System.out.println(numOne.floatValue());
		sc.close();

	}

}
