package com.java.basics;

public class LoopsInJava {

	public static void main(String[] args) {
		int x = Integer.MAX_VALUE;// local var to main()

		// Print 1 to 100
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);// ........

//		i++ Post Increment
//		i = i+1
//		i+=1
//		i++ and ++i
		short i = 1;
//		for
		for (i = 1; i <= 100; i--) {
//			System.out.println(i);
		}
		System.out.println("i" + i);
		System.out.println(0x7fffffff);
		System.out.println(++x);
		System.out.println(x);

		int colorBlack = 0x1e1f1f;
		System.out.println(colorBlack);

//		while
		int i1 = 1;
		while (i1 <= 100) {
			if (i1 % 2 == 0)
				System.out.print(i1 + " ");
			i1++;
		}

		// do while
		do {
			System.out.println("impossible");
		} while (4 == 5);

	}

}
// -32768		-1	0	1				32767