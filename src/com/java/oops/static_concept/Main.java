package com.java.oops.static_concept;

public class Main {

	static public void main(String... suman) {

		Student s1 = new Student("Jack");
		Student s2 = new Student("Jane");
		Student s3 = new Student("John");
		Student s4 = new Student("Jammi");

		Student[] students = { s1, s2, s3, s4 };

//		s3.college = "KLM college";
		Student.college = "KLM college";
		for (Student s : students) {
			System.out.println(s);
		}

		int fetchCounter = Student.fetchCounter();
		System.out.println(fetchCounter);

		s4.dummy("suamn", "jame");

	}

	public static void main(Integer[] args) {
		System.out.println("2ND MAIN( )");
	}

}

//1
//2 ravi srinadh
//none chandan muskaan
//both
//error sanddep
