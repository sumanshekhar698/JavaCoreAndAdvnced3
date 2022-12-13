package com.java.basics.oops.strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String x = " Sita Raman 🙃";
		x = x.trim();// removing the trailing spaces
		System.out.println(x);

		char ch = x.charAt(x.length() - 1);
		System.out.println(ch);

		ch = x.charAt(0);
		System.out.println(ch);

		boolean endsWith = x.endsWith("An");
		System.out.println(endsWith);

		int indexOf = x.indexOf('a');
		System.out.println(indexOf);

		indexOf = x.indexOf("ita");
		System.out.println(indexOf);

		String[] split = x.split(" ");
		System.out.println(Arrays.toString(split));

		x = x.toUpperCase();
		System.out.println(x);

		String y = x.toLowerCase();
		System.out.println(y);
		if (x.equalsIgnoreCase(y))
			System.out.println(true);
		else
			System.out.println(false);

	}

}
