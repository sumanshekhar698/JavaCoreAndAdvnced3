package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CustomSorting {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(54);
		numbers.add(24);
		numbers.add(47);
		numbers.add(454);
		numbers.add(41);
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(5, "ROCKY", 30));
		students.add(new Student(8, "SAM", 40));
		students.add(new Student(54, "JOHN", 33));
		students.add(new Student(15, "MIKE", 20));
		students.add(new Student(1, "TANY", 37));
		students.add(new Student(5, "JANE", 39));
		Collections.sort(students);
		System.out.println(students);

	}

}

class Student implements Comparable<Student> {

	int rollNo;
	String name;
	int age;

	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student s) {
		if (s.rollNo == rollNo)
			return 0;
		else if (s.rollNo < rollNo)
			return 2;
		else
			return -4;

	}

}
