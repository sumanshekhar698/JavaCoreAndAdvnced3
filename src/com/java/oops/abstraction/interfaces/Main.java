package com.java.oops.abstraction.interfaces;

public class Main {

	public static void main(String[] args) {
		ChildrenBank cBank = new ChildrenBank();
		System.out.println(cBank.clearingGateway());
		
		Bank bank = new Bank() {
			@Override
			public int checkBalance(int acNo) {
				// TODO Auto-generated method stub
				return 367280;
			}

			@Override
			public String bankName() {
				// TODO Auto-generated method stub
				return "Bank of Nepal";
			}
			
		};
		
//		Functiona Interfaces, Marekr Interfaces
	}
}
