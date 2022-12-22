package com.java.basics.arrays.two_dimensional;

import java.util.Arrays;

public class TwoDArrayIntro {

	public static void main(String[] args) {

		int[][] matrix = new int[8][4];

		System.out.println(Arrays.toString(matrix));

		for (int i = 0; i < matrix.length; i++) {
			Arrays.fill(matrix[i], i);
		}

		// Iteration 2D array
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + "   ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		// Matrix Multiplication
		// Transpose Of Matrix
		// Determinant Matrix
		// Inverse Of Matrix
		// Searching is a full sorted 2D Matrix
		// Spiral Pattern

	}

}
