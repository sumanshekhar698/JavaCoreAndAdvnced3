package com.java.basics.oops.strings;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Give the input 1");
		String sampleString2 = sc.nextLine();// "sample"

		boolean result = palindromeChecker(sampleString2);
		System.out.println(result);

	}

	private static boolean palindromeChecker(String sampleString2) {
//		"radar"
//		"madam"

		/*
		 * String result = ""; for (int i = sampleString2.length() - 1; i >= 0; i--) {
		 * result += sampleString2.charAt(i); }
		 * 
		 * if (result.equals(sampleString2)) return true; else return false;
		 */

		return sampleString2.equals(
				new StringBuilder(sampleString2)
				.reverse()
				.toString()) 
				? true : false;
	}

}
