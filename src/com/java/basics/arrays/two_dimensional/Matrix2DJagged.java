package com.java.basics.arrays.two_dimensional;

import java.util.Arrays;

public class Matrix2DJagged {

	public static void main(String[] args) {

		int[][] jagged = new int[5][];// 5 1D array ref as null

		int[] x = new int[0];// Zero Array size is fine

//		System.out.println(Arrays.toString(jagged));

		jagged[0] = new int[4];
		jagged[1] = new int[1];
		jagged[2] = new int[3];
		jagged[3] = new int[4];
		jagged[4] = new int[2];

//		for (int i = 0; i < jagged.length; i++) {
//			for (int j = 0; j < jagged[i].length; j++) {
//				System.out.print(jagged[i][j] + "   ");
//			}
//			System.out.println();
//		}
		
		
		
		for (int i = 0; i < jagged.length; i++) {
			Arrays.fill(jagged[i], i);
		}
		
		
		for (int i = 0; i < jagged.length; i++) {
			System.out.println(Arrays.toString(jagged[i]));
		}
		
		

	}

}
