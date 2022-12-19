package com.java.basics.oops.strings.mutable;

public class PerfomanceCheck {

	public static void main(String[] args) {

		int iterations = 10000;
		// Immutable
		String s1 = new String("Jack");
		String s2 = "Jill";

		// Mutable
		StringBuffer s3 = new StringBuffer("Hill");
		StringBuilder s4 = new StringBuilder("Fair");

//		Test 1
		long initial = System.nanoTime();
		for (int i = 0; i < iterations; i++) {
			s1 += "Tang";
		}

		long end = System.nanoTime();
		System.out.println("Sting using *new took " + (end - initial));

//		Test 2
		initial = System.nanoTime();
		for (int i = 0; i < iterations; i++) {
			s2 += "Tear";
		}
		end = System.nanoTime();
		System.out.println("Sting literal took " + (end - initial));

//		Test 3
		initial = System.nanoTime();
		for (int i = 0; i < iterations; i++) {
			s3.append("Pour");
		}
		end = System.nanoTime();
		System.out.println("StingBuilder took " + (end - initial));

//		Test 4
		initial = System.nanoTime();
		for (int i = 0; i < iterations; i++) {
			s4.append("Moon");
		}
		end = System.nanoTime();
		System.out.println("StingBuffer took " + (end - initial));
	}

}
