package com.java.oops.inheritance;

public class PlayerMain {

	public static void main(String[] args) {

		IPLPlayer viratKohli = new IPLPlayer("Viral Kohli", 30, 70, 180, 18, 10000, 0, false);
		System.out.println(viratKohli);
		viratKohli.sayMyName();
		viratKohli.sayMyAge();
//		viratKohli.tester();

//		Type Casting
		Player rohitSharma = new IPLPlayer("Rohit Sharma", 45, 80, 190, 8, 10080, 0, false);// Implicit Upcasting

		IPLPlayer rohitSharma2 = (IPLPlayer) rohitSharma;// you can downcast only an already upcasted object
		// Downcasting
//		IPLPlayer dummy = (IPLPlayer) new Player("Dummy", 0, 0, 0, 0);//Explicit Typcasting
	}

}
