package com.java.oops.encapsulation;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

//		Employee e1 = new Employee();
//		e1.name = "Jack Sparrow";
//		e1.dob = new Date(System.currentTimeMillis());
//		System.out.println(e1.toString());// random value which is calculated using hashcode

//		new Employee(null, 0, 0, args, 0, null)

		Employee harry = new Employee("Harry potter", 123, 10, new String[] { "Magic", "Sorcerry" }, 1000,
				new Date(1994, 10, 14));
		System.out.println(harry);

//		harry.experience = -2;

		int experience = harry.getExperience();
		harry.setExperience(++experience);
		Employee harrydup = harry.returnEmployee();

		Employee dummy = new Employee();
		System.out.println(dummy);
		System.out.println(harry);
		System.out.println(harry.hashCode());
		System.out.println(harrydup.hashCode());

	}

}
