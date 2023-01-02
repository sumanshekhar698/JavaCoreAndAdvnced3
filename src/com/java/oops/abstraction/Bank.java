package com.java.oops.abstraction;

public abstract class Bank {

	int x = 20;

	abstract int checkBalance(int acNo);// abstract methods  abstraction level --> 50 %

	String bankName() {//concrete method
		return "Children Bank";
	}

}
