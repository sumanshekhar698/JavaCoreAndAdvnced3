package com.java.oops.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		ArrayList<Student> students = new ArrayList<>();
//		students.add(new Student(5, "ROCKY", 30));
//		students.add(new Student(8, "SAM", 40));
//		students.add(new Student(54, "JOHN", 33));
//		students.add(new Student(15, "MIKE", 20));
//		students.add(new Student(1, "TANY", 37));
//		students.add(new Student(5, "JANE", 39));
		Student s1 = new Student(5, "JANE", 39);

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaCoreAndAdvnced3\\src\\notes\\permanet_zone.txt";

		FileOutputStream fileOutputStream = new FileOutputStream(path);

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(s1);
		objectOutputStream.flush();// this is must

		objectOutputStream.close();
		fileOutputStream.close();

//		System.out.println(s1);

	}

}
