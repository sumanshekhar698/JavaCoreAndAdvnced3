package com.java.basics.arrays;

import java.util.Arrays;

public class LinearArray {

	public static void main(String[] args) {

		int x, y, z[];

		int[] roll = new int[7];// [0,0,0,0,0,0,0]
		System.out.println(roll);//

		for (int i = 0; i < roll.length; i++) {
			System.out.print(roll[i] + ",");
		}

		System.out.println();
		System.out.println(Arrays.toString(roll));

		int counter = 1;
		for (int i = 0; i < roll.length; i++) {
			roll[i] = counter++;
		}

		System.out.println(Arrays.toString(roll));

//		Fibonacci
//		Linear Search
//		Binary Search
	}

}
