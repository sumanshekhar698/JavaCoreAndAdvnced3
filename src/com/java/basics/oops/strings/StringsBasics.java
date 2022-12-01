package com.java.basics.oops.strings;

public class StringsBasics {

	public static void main(String[] args) {

		// String literal
		String x = "SitaRamam";
		System.out.println(x);
		String y = "SitaRamam";
		System.out.println(y);

		if (x == y)
			System.out.println(true);

		if (x.equals(y))
			System.out.println(true);
		else
			System.out.println(false);
		
		// String using new keyword
		String m = new String("heMan");
		String n = new String("heMan");

		if (m == n)
			System.out.println(true);
		else
			System.out.println(false);

		if (m.equals(n))
			System.out.println(true);
		else
			System.out.println(false);
	}

}
