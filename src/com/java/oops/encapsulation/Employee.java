package com.java.oops.encapsulation;

import java.util.Arrays;
import java.util.Date;

public class Employee {

	// default
	
	//instance variable are object level
	String name;
	private int id;
	private int experience;
	private String[] skills;
	private long salary;
	private Date dob;

//	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", experience=" + experience + ", skills="
				+ Arrays.toString(skills) + ", salary=" + salary + ", dob=" + dob + "]";
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	// Constructor --> it has no return type
	Employee() {// parameter less
		this(true);
//		return;
		System.out.println("Employee un parameterized");

	}

	Employee(boolean flag) {// parameter less
//		this();
		System.out.println("Employee flag called");
	}

	// Employee(String, int, int, int[], int, null)
	public Employee(String name, int id, int experience, String[] skills, long salary, Date dob) {
//		super();
		this();// Constructor Chaining

		System.out.println("Employee parameterized");
		// shadow problem
		this.name = name;
		this.id = id;
		this.experience = experience;
		this.skills = skills;
		this.salary = salary;
		this.dob = dob;
	}

	Employee returnEmployee() {
		return this;
	}

	// private protected default public

}
