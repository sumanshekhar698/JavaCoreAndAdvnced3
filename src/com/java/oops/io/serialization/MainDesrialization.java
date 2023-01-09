package com.java.oops.io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDesrialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaCoreAndAdvnced3\\src\\notes\\permanet_zone.txt";

		FileInputStream fileInputStream = new FileInputStream(path);

		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		Student s1 = (Student) objectInputStream.readObject();
		System.out.println(s1);
		objectInputStream.close();
//		objectOutputStream.writeObject(s1);
//		objectOutputStream.flush();// this is must

	}

}
