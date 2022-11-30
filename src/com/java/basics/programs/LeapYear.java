package com.java.basics.programs;

public class LeapYear {

	public static void main(String[] args) {

		int year = 4;
		if (year % 4 == 0) {
			if (year % 100 == 0 && year % 400 == 0)
				System.out.println("LEAP YEAR");
			else if (year % 100 == 0) {
				System.out.println("NOT A LEAP YAER");
			} else {
				System.out.println("LEAP YEAR");
			}
		} else {
			System.out.println("NOT A LEAP YEAR");
		}

	}
}
