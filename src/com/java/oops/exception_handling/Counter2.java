package com.java.oops.exception_handling;

import java.util.Scanner;

public class Counter2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("START");
		System.out.println("Eneter tiem for the timer in seconds");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();

		Thread.sleep(-1000);

		System.out.println("END");
	}

}
