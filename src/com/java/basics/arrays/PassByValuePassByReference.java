package com.java.basics.arrays;

import java.util.Arrays;

public class PassByValuePassByReference {

//	PassByReference  ==> sending a mutable object
//	PassByValue  ==> sending a immitable object

	public static void main(String[] args) {

		int[] nums = { 4, 76, 324, 65, 23, 654, 55, 65, 76 };// Arays object are mutable
		Integer x = 9;// Strings//Boolean//Character ==> immutable

		int nums2[] = nums;
		
		//Cloning , Deep Copy
		int [] dummy = new int [nums.length];
		for (int i = 0; i < dummy.length; i++) {
			dummy[i]=nums[i];
		}
		
		int [] cloned = nums.clone();//this is only valid for 1D arrays
		
		work(dummy, x);
		
		System.out.println(Arrays.toString(nums));
		System.out.println(x);
		// { 4, 76, 324, 65, 23, 654, 55, 65, 76 }
		// {-1,-1,-1,-1,-1,-1,-1,-1,-1} ✔️
		// ~ Runtime Error

		// ~ Compile Time error
		// ~ My PC will blow up 🔥
	}

	private static void work(int[] sample, Integer y) {
		Arrays.fill(sample, -1);
		y = 10;

	}

}
