package com.java.oops.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>(10, 0.6f);//0.75

		hashSet.add(4);
		hashSet.add(5);
		hashSet.add(65);
		hashSet.add(5);
		hashSet.add(75);
		hashSet.add(5);
		hashSet.add(57);
		hashSet.add(75);

		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");
		}

		boolean contains = hashSet.contains(57);
		System.out.println(contains);// hashing makes searching very fast

	}

}
