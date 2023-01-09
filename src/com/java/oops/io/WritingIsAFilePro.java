package com.java.oops.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class WritingIsAFilePro {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaCoreAndAdvnced3\\src\\notes\\write.txt";

		System.out.println(Arrays.toString("Java is a very nice language".getBytes()));
		FileOutputStream fop;

		fop = new FileOutputStream(path);// nio APis
		fop.write("Java is a very nice language".getBytes());
		fop.close();

	}

}
