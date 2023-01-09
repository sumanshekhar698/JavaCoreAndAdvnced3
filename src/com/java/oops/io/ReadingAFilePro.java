package com.java.oops.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAFilePro {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaCoreAndAdvnced3\\src\\notes\\write.txt";

		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

		FileInputStream fip;

		FileInputStream fileInputStream = new FileInputStream(path);//nio APis
		int read;
		while ((read = fileInputStream.read()) != -1) {
			System.out.print((char)read);
		}
//\n
		fileInputStream.close();//XML Json files POI FTP/SFTP

	}

}
