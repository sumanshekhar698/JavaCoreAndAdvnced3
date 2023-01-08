package com.java.oops.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> studentRecord = new HashMap<>();

		studentRecord.put(1, "John");// one entry
		studentRecord.put(2, "Jack");
		studentRecord.put(3, "Jill");
		studentRecord.put(4, "Jamie");

		System.out.println(studentRecord);
		studentRecord.put(3, "Marry");
		System.out.println(studentRecord);// keys are unique and they cannot be duplicated / value can be duplicate

		boolean containsKey = studentRecord.containsKey(2);// is very fast in searching
		System.out.println(containsKey);

		boolean containsValue = studentRecord.containsValue("Jill");
		System.out.println(containsValue);

		for (Entry<Integer, String> student : studentRecord.entrySet()) {
			System.out.println(student);
			student.getKey();
			student.getValue();
		}
		
		studentRecord.entrySet().forEach(x->System.out.print(x+" "));

	}

}
