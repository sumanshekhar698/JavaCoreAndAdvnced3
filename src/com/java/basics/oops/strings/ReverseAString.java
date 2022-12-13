package com.java.basics.oops.strings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Give the input 1");
		String sampleString1 = sc.next();
		System.out.println("Give the input 2");

		String sampleString2 = sc.nextLine();// "sample"

		String result = "";

		for (int i = sampleString2.length() - 1; i >= 0; i--) {
			result += sampleString2.charAt(i);
		}

		System.out.println(result);

	}

}
