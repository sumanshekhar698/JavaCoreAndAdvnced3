package com.java.basics.programs;

public class LudoMain {

	public static void main(String[] args) {

		System.out.println(new UserMainCode().ludo(7));

	}

}

class UserMainCode {

	public int ludo(int input1) {
		// Read only region end here
		// Write your code here
		if (input1 == 1 || input1 == 6)
			return 1;
		else if (input1 == 2 || input1 == 3 || input1 == 4 || input1 == 5)
			return 0;

		throw new UnsupportedOperationException("ludo(int input1)");

	}
}
