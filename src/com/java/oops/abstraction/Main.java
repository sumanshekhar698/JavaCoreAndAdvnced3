package com.java.oops.abstraction;

public class Main {
	
	public static void main(String[] args) {
//		new Bank();// you cannot *directly instantiate a Abstract class
		
		ChildrenBank childrenBank = new ChildrenBank();
		
		String bankName = childrenBank.bankName();
		System.out.println(bankName);
		
		Bank bank2 = new Bank() {//Annonymous inner class
			
			@Override
			int checkBalance(int acNo) {
				// TODO Auto-generated method stub
				return 1001;
			}
		};
		
		String bankName2 = bank2.bankName();
		System.out.println(bankName2);
		int checkBalance = bank2.checkBalance(8);
		System.out.println(checkBalance);
		
		
	}

}
