package com.java.basics.programs;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roll i/p");
		int roll = sc.nextInt();
		System.out.println(roll);
		
		sc.nextLine();
		System.out.println("NAME i/p");
		String name = sc.nextLine();
		
		System.out.println(name.length());
	}

}
