package com.java.basics.programs;

public class SwapTwoNumbersWithoutTempVariable {

	public static void main(String[] args) {

		int x = Integer.MAX_VALUE;

		int y = Integer.MAX_VALUE;

//		int temp = y;
//		y = x;
//		x = temp;
//		System.out.println(x);
//		System.out.println(y);

//		SUM WAY without temp
		x = x + y;
		System.out.println(x);
		y = x - y;
		x = x - y;

//		XOR gate
		int h = 9 ^ 9;
		System.out.println(h);

		System.out.println(x);
		System.out.println(y);

	}

}
