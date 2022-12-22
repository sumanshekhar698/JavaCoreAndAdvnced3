package com.java.basics.arrays.two_dimensional;

import java.util.Arrays;

public class Sorting2DJaggedArray {

	public static void main(String[] args) {

		// Sort via Row

		int[][] jagged = { { 4, 87, 23, 654, 7 }, { 45, 245, 65, 34, 465 }, { 543, 23, 54 },
				{ 243, 453, 423, 23, 32, 43, 35, 7 } };

		for (int i = 0; i < jagged.length; i++) {
			System.out.println(Arrays.toString(jagged[i]));
		}

		System.out.println("********************  SORTING **********************");

		for (int i = 0; i < jagged.length; i++) {
			Arrays.sort(jagged[i]);
		}

		for (int i = 0; i < jagged.length; i++) {
			System.out.println(Arrays.toString(jagged[i]));
		}

		System.out.println("********************  CLONE **********************");

//		int[][] clonedArray = jagged.clone();
//		Arrays.fill(clonedArray[0], -1);

		int[][] clonedArray = new int[jagged.length][];

		for (int i = 0; i < jagged.length; i++) {
			clonedArray[i] = jagged[i].clone();

		}
		Arrays.fill(clonedArray[0], -1);
		
		for (int i = 0; i < jagged.length; i++) {
			System.out.println(Arrays.toString(jagged[i]));
		}

	}

}
