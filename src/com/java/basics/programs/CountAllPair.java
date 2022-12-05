package com.java.basics.programs;

public class CountAllPair {

	public static void main(String[] args) {

		System.out.println(new UserMainCode_2().AllPair(8));

	}

}

class UserMainCode_2 {

	public int AllPair(int input1) {
		// Read only region end here
		// Write your code here

		int count = 0;

		for (int i = 1; i < input1; i++) {
			for (int j = 1; j < input1; j++) {
				if (i + j == input1)
					count++;

			}
		}

		if (count > 0)
			
			return count;

		throw new UnsupportedOperationException("AllPair(int input1)");

	}
}
