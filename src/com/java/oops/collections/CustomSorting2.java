package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSorting2 {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(5, "MIke"));
		emp.add(new Employee(15, "Michelle"));
		emp.add(new Employee(45, "Harry"));
		emp.add(new Employee(25, "Biden"));
		emp.add(new Employee(5, "John"));
		emp.add(new Employee(2, "Harry"));

		Collections.sort(emp, new EmployeeIDComparator());
		System.out.println(emp);

	}

}

class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

class EmployeeIDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.id == e2.id)
			return 0;
		else if (e1.id < e2.id)
			return 2;
		else
			return -4;
	}

}
