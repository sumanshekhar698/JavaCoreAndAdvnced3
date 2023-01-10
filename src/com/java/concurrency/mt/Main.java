package com.java.concurrency.mt;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("START");
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i);
//			Thread.sleep(500);
//		}

		Looper l1 = new Looper();
		Looper l2 = new Looper();
		Looper l3 = new Looper();
		Looper l4 = new Looper();

		System.out.println(l1.getState());
		System.out.println(l2.getState());
		System.out.println(l3.getState());
		System.out.println(l4.getState());

		l1.setName("l1");
		l2.setName("l2");
		l3.setName("l3");
		l4.setName("l4");

		l3.setPriority(10);
		l1.start();
		l2.start();
		l3.start();
		l4.start();

		System.out.println(l1.getState());
		System.out.println(l2.getState());
		System.out.println(l3.getState());
		System.out.println(l4.getState());

		// 2ne -- With using runnable
		Looper2 lop2_1 = new Looper2();
		Looper2 lop2_2 = new Looper2();
		Looper2 lop2_3 = new Looper2();

		Thread t1 = new Thread(lop2_1);
		Thread t2 = new Thread(lop2_2);
		Thread t3 = new Thread(lop2_3);
		t1.setName("t1");
		t1.setName("t1");

		t2.setName("t2");
		t3.setName("t3");

		t1.start();
		t2.start();
		t3.setPriority(2);//1 - 10
		t3.start();
		

		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());

		System.out.println("END");

	}
}

class Looper extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			try {
//				Thread.sleep(1100);
				System.out.println(i + " -->" + Thread.currentThread());
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			

		}

	}
}

class Looper2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
//			try {
//				Thread.sleep(1100);
				System.out.println(i + " -->" + Thread.currentThread());
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			

		}

	}
}
