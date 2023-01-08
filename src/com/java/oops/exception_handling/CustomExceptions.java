package com.java.oops.exception_handling;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) {

		boolean result = false;
		try (Scanner sc = new Scanner(System.in);) {// try with resource only works for resource which are
													// AutoCloseable
			System.out.println("Enter your age to check eligiblity for voting");
			int age = sc.nextInt();
			result = checkEligiblityForVoting(age);
		} catch (IllegalVotingAge e) {
			e.printStackTrace();
		} catch (InvalidAge e) {
			e.printStackTrace();
		}
//		finally {
//			sc.close();
//		}
		System.out.println(result);

	}

	private static boolean checkEligiblityForVoting(int age) throws IllegalVotingAge, InvalidAge {
		// TODO Auto-generated method stub

		if (age <= 0 || age > 125)
			throw new InvalidAge("Check the entered age its invalid");
		if (age < 18) {
			throw new IllegalVotingAge("The person is too yooung to vote");
		}
		return true;
	}

}

class IllegalVotingAge extends Exception {

	public IllegalVotingAge(String message) {
		super(message);
	}

}

class InvalidAge extends Exception {

	public InvalidAge(String message) {
		super(message);
	}

}
