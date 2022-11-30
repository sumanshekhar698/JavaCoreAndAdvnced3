package com.java.basics.programs;

public class AverageOfTwoNumbers {

	public static void main(String[] args) {

		long num_1 = Integer.MAX_VALUE;//1 2 4*8 = 32 ( -2^31  ---> 2^31  - 1)
		long num_2 = Integer.MAX_VALUE;
		long sum = num_1 + num_2;
//		System.out.println((num_1 + num_2) / 2);//sol 1
		System.out.println(sum / 2);//sol 2
	}
}
