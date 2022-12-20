package com.java.basics.arrays;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		// Generally Sorted Array
		// Divide and Conquer
		// mid

		int[] nums = { 4, 76, 324, 65, 23, 654, 55, 65, 76 };// Arays object are mutable

//		n^2 * Bubble Sort [Simple bubble sort, Optimized Form]
//		* Merge Sort
//		Quick Sort
//		* Insertion Sort
//		Selection Sort

		Arrays.sort(nums);// O(n log(n))
		System.out.println(Arrays.toString(nums));// [4, 23, 55, 65, 65, 76, 76, 324, 654]
		int index = binarySearch(nums, 65, 0, nums.length - 1);
		System.out.println(index);
	}

	private static int binarySearch(int[] nums, int num, int start, int end) {

		int mid = (start + end) / 2;

		while (start <= end) {
			mid = (start + end) / 2;
			if (nums[mid] == num)
				return mid;
			else if (nums[mid] < num)
				start = mid + 1;
			else
				end = mid - 1;
		}

		return -1;

//		return false;
	}

}
