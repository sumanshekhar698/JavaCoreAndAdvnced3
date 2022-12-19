package com.java.basics.arrays;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {

		int input = 19;
		int[] fibo = new int[input];

		int j = 0;
		int x = 0;
		int y = 1;

		if (input == 1)
//			System.out.println(x);
			fibo[j++] = x;
		else if (input == 2) {
//			System.out.println(x);
			fibo[j++] = x;
			fibo[j++] = y;
//			System.out.println(y);

		} else {
			System.out.println(x);
			System.out.println(y);
			for (int i = 3; i <= input; i++) {
				int temp = x + y;
//				System.out.println(temp);
				fibo[j++] = temp;
				x = y;
				y = temp;

			}
		}
		
		System.out.println(Arrays.toString(fibo));

	}

}
