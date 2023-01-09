package com.java.oops.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingAFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaCoreAndAdvnced3\\src\\notes\\day1.txt";
		File file = new File(path);

		try (Scanner sc = new Scanner(file);) {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();

		}
		
		

	}

}
