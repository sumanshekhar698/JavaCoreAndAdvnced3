package com.java.oops.inheritance;

import java.util.Scanner;

import com.java.oops.encapsulation.Student;

//import com.java.oops.static_concept.Student;

public class Main {


	final static double VALUE_OF_PI = 3.14159;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// ctrl + shift + O this will do autoimport

		Student s1 = new Student("Suman", 65);
		com.java.oops.static_concept.Student s2 = new com.java.oops.static_concept.Student("SUMAN");

//		pi = 30.14159;
		System.out.println("Area of circle");
		int radius = sc.nextInt();
		System.out.println(VALUE_OF_PI*radius*radius);
		
		double pi2 = Math.PI;

	}

}
