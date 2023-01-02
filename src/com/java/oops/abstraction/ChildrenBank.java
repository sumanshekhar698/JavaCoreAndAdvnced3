package com.java.oops.abstraction;

public class ChildrenBank extends Bank{

	@Override
	int checkBalance(int acNo) {
		return 10000;
	}

}
