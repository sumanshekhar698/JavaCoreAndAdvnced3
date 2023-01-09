package com.java.oops.io;

import java.io.File;
import java.io.IOException;

public class FileCreationAndDeletion {

	public static void main(String[] args) {
		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaCoreAndAdvnced3\\src\\notes\\day9.txt";
		File file = new File(path);

//		System.out.println("\"");
		System.out.println("Initial check ==>"+file.exists());
		boolean exists = false;
		try {
			exists = file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("EXISTS after creating==> "+file.exists());


		if (exists) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.getParent());
		}

		exists = file.delete();
		System.out.println("EXISTS after deleting==> "+file.exists());

	}

}
