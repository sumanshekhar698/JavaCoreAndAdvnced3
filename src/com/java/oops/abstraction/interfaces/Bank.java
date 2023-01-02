package com.java.oops.abstraction.interfaces;

public interface Bank {// in interface you cannot have a concrete method

	public static final int x = 0;// public static final by default for all the var
	float bal = 0.0f;

	abstract int checkBalance(int acNo);// abstract methods abstraction level --> 50 %

	String bankName();// abstract keyword in optional
}

interface Clearing {
	String clearingGateway();
}
