package com.java.basics.arrays;

public class LinearSearch {

	public static void main(String[] args) {

		int[] nums = { 4, 76, 324, 65, 23, 654, 55, 65, 76 };

		boolean result = linearSearch(nums, 76);
		System.out.println(result);
		System.out.println(linearSearchFindIndex(nums, 654));
	}

	private static boolean linearSearch(int[] nums, int search) {

//		O(n)= n Worst Time Complexity
//		Best Time Complexity(n) = c
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == search)
				return true;
		}
		return false;
	}

	private static int linearSearchFindIndex(int[] nums, int search) {
//		O(n)= n Worst Time Complexity
//		Best Time Complexity(n) = c
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == search)
				return i;
		}
		return -1;
	}

}
