package com.java.oops.abstraction.interfaces;

public class ChildrenBank implements Bank,Clearing {

	@Override
	public int checkBalance(int acNo) {
		// TODO Auto-generated method stub
		return 938389;
	}

	@Override
	public String bankName() {
		// TODO Auto-generated method stub
		return "Bank of India";
	}

	@Override
	public String clearingGateway() {
		// TODO Auto-generated method stub
		return "NPCI";
	}

}
