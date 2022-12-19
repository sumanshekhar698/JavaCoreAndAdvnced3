package com.java.basics.oops.strings.mutable;

public class MutableStringsBuffer {

	public static void main(String[] args) {

		// Mutable String
		
		StringBuffer s1 = new StringBuffer("SitaRaman");//best suited for Multi Thread env
		int intiialCapacity = s1.capacity();
		System.out.println(intiialCapacity);

		System.out.println(s1.length());
		s1.append(" is a good movie");
		System.out.println(s1);

		s1.insert(4, " ");
		System.out.println(s1);
		s1.replace(16, 20, "fantastic");
		System.out.println(s1);

		s1.delete(25, 31);
		System.out.println(s1);

		System.out.println(s1.capacity());
//		boolean empty = s1.isEmpty();

		System.out.println(s1.reverse());

		String mbappe = "Messi";
		StringBuffer messi = new StringBuffer("Messi");

		if (mbappe.equals(messi.toString()))
			System.out.println(true);
		else
			System.out.println(false);
		
		
		

//		System.out.println(empty);

	}

}
