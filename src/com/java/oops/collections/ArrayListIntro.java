package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.java.oops.static_concept.Student;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Any collection will store Objects only not the primitive types.
		ArrayList random = new ArrayList();
		random.add("MickeyMouse");
		random.add(3.14);
		random.add(new Student("Jane"));
		System.out.println(random);

		random.remove(1);
		System.out.println(random);
//		random.clear();
		System.out.println(random);
		boolean contains = random.contains("MickeyMouse");
		System.out.println(contains);
		int size = random.size();
		System.out.println(size);

		ArrayList<Integer> numbers = new ArrayList<Integer>();// Generics
		numbers.add(6);

		for (int i = 1; i <= 10; i++) {
			numbers.add(i);// Autoboxing
		}

		System.out.println(numbers);
		int frequency = Collections.frequency(numbers, 6);
		System.out.println(frequency);
		Collections.sort(numbers);
		System.out.println(numbers);

		Collections.shuffle(numbers);
		System.out.println(numbers);

		Collections.shuffle(numbers);
		System.out.println(numbers);

//		Iteration

		Collections.sort(numbers);

//		Using a iterator
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {// -1
			Integer integer = (Integer) iterator.next();
			System.out.print(integer + " ");
		}
		System.out.println();

		// You should not mutate your collections while iterating
//		for (int i = 0; i < numbers.size(); i++) {
//			numbers.add(i);
//			System.out.print(numbers.get(i) + " ");
//		}

		for (Integer integer : numbers) {
//			numbers.remove(integer);
		}

		numbers.add(0, 100);
		numbers.add(5, 100);

		numbers.add(numbers.size(), 999);
//		numbers.forEach(System.out::print);
		for (Integer integer : numbers) {
//			numbers.remove(integer);
			System.out.print(integer + " ");
		}
		
		Set<Integer> collect = numbers.stream().collect(Collectors.toSet());
		System.out.println(collect);

//		List<Integer> collect2 = collect.stream().filter(number->number%2==0).collect(Collectors.toList());
		 collect.stream().filter(number->number%2==0).forEach(number -> System.out.print(number + " "));

//		System.out.println(collect2);
//		 Integer[] array = numbers.stream().toArray()

	}

}
