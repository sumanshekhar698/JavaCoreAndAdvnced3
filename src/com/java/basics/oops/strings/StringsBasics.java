package com.java.basics.oops.strings;

public class StringsBasics {

	public static void main(String[] args) {

//		IMMUTABLE STRINGS

		int x = 9;
		int y = 10;
		int z = x + y;// 19

		// String literal
		String movie1 = "SitaRaman";
		String movie2 = "sitaraman";
		String movie3 = "SitaRaman";

		movie2 = movie2 + "SUper HIt !";//contatination
		// + is the only operator which is overloaded
		
		

		System.out.println(movie2);//SitaRamanSUper HIt !
		
		if (movie1 == movie3)
			System.out.println("EQUAL");
		else
			System.out.println("NOT Equal");

		String hollywoodMovie_1 = new String("Avatar");
		String hollywoodMovie_2 = new String("Avatar");
		if (hollywoodMovie_1 == hollywoodMovie_2)
			System.out.println("EQUAL");
		else
			System.out.println("NOT Equal");
		
		hollywoodMovie_1 = hollywoodMovie_1.concat("- the way of water");
		System.out.println(hollywoodMovie_1);//Avatar - the way of water

	}

}
