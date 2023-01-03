package com.java.oops.abstraction.interfaces.marker_interface;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		int[] num = { 4, 6, 23, 54, 6 };
		int[] num2 = num.clone();

		Student s1 = new Student("John", 6);
		System.out.println(s1);

		Student clonedS1 = (Student) s1.clone();
	
		clonedS1.id=0;
		System.out.println(clonedS1);
	}

}
