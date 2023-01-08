package com.java.oops.exception_handling;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {

		System.out.println("START");
		System.out.println("Eneter tiem for the timer in seconds");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();

		for (int i = 1; i <= time; i++) {
			try {
//				System.exit(7);
				System.out.println(7 / 0);
				Thread.sleep(1000);
			} catch (InterruptedException | ArithmeticException e) {// Checked Exceptions
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println(e);
			} catch (Throwable e) {
				System.out.println(e);
			} finally {// resource closing code
				System.out.println("FINALY");
				sc.close();
			}
			System.out.println(i);

		}

		System.out.println("END");
	}

}
