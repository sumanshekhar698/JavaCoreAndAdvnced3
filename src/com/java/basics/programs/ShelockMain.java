package com.java.basics.programs;

public class ShelockMain {

	public static void main(String[] args) {

		System.out.println(new UserMainCode_1().Help(30, 4));

	}

}

class UserMainCode_1 {

	public int Help(int input1, int input2) {
		// Read only region end here
		// Write your code here
		if (input1 % input2 == 0)
			return 1;
		else if (input1 % input2 != 0)
			return 0;

		throw new UnsupportedOperationException("Help(int input1, int input2)");

	}
}
