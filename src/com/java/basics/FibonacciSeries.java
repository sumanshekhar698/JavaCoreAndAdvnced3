package com.java.basics;

public class FibonacciSeries {

	public static void main(String[] args) {

		int input = 19;

		int x = 0;
		int y = 1;

		if (input == 1)
			System.out.println(x);
		else if (input == 2) {
			System.out.println(x);
			System.out.println(y);

		} else {
			System.out.println(x);
			System.out.println(y);
			for (int i = 3; i <= input; i++) {
				int temp = x + y;
				System.out.println(temp);
				x = y;
				y = temp;

			}
		}

	}

}
