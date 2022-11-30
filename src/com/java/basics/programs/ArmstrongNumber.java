package com.java.basics.programs;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int x = 371;

		/*
		 * 371 = digits 3
		 * 
		 * 3^3 + 7^3 + 1^3 = 371
		 */

		boolean findArmstrong = findArmstrong(370);
		System.out.println(findArmstrong);

//		Print 1st n Armstrong numbers
		int n = 20;
		int i = 0;
		while (n > 0) {
			findArmstrong = findArmstrong(i);
			if (findArmstrong) {
				n--;
				System.out.println(i);
			}
			++i;
		}

	}

	static boolean findArmstrong(int x) {

		int temp = x;
		int temp2 = x;
		int digit = 0;
		int sum = 0;

		// Say 371

//		Calculate Number of digits in x
		while (temp > 0) {
			temp = temp / 10;
			++digit;// 3
		}

		// calculate the sum for Armstrong check
		for (int i = 1; i <= digit; i++) {
			int rem = temp2 % 10;
			temp2 = temp2 / 10;
			sum += Math.pow(rem, digit);
		}

		if (sum == x)
			return true;
		else
			return false;

	}

}
