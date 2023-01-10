package com.java.concurrency.mt;

public class VisblityProblem {

	 static boolean flag = true;
//	volatile static boolean flag = true;

	public static void main(String[] args) {

		System.out.println("START " + Thread.currentThread());

		Thread t1 = new Thread(() -> {

			while (flag) {
				try {
					Thread.sleep(600);
					System.out.println("STOP ME if you can !!!!!!");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(() -> {

			try {
				Thread.sleep(800);
				flag=false;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

		t1.start();
		t2.start();

		System.out.println("END " + Thread.currentThread());

	}
	
	//Syncronization
	//FutoreClases
	//LOcks

}
