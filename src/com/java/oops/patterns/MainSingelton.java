package com.java.oops.patterns;


//Singelton Designed Pattern
public class MainSingelton {

	public static void main(String[] args) {

//		NCERT.about = "Education Board";
		
		NCERT one = NCERT.createSingleObjectOnly("Education Board");
		System.out.println(one);
		
		
		NCERT two = NCERT.createSingleObjectOnly("Education Board 2");
		System.out.println(two);

		
		
	}

}
