package com.java.oops.static_concept;

import java.util.Arrays;

import javax.management.relation.Role;

public class Student {

	private String name;
	private String rollNumber;
	static String college = "XYZ Collge";// class level
	static int counter;

//	static things are initialized before object ctration
//	static things are stored in a space called permgen
	static {
//		System.out.println(name);
		counter = 60;
	}

	public Student(String name) {
//		super();
		this.name = name;
		this.rollNumber = "YH" + ++counter;

//		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", college=" + college + "]";
	}

	static int fetchCounter() {// Non Static things caznnot be access directly in static methods and static
								// blocks
		return counter;
	}
	
	void dummy(String ... arguments){
		System.out.println(Arrays.toString(arguments));
	}

}
