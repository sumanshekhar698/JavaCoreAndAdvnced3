package com.java.oops.io;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaCoreAndAdvnced3\\src\\notes\\day1.txt";
		File file = new File(path);
		
//		System.out.println("\"");
		System.out.println(file.exists());
		boolean exists = file.exists();
		
		if(exists) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.getParent());
		}
		
	}

}
