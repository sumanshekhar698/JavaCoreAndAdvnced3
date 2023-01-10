package com.java.concurrency.mt;

public class Waiting {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START " + Thread.currentThread());

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 20; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i + " ==>" + Thread.currentThread());

			}
		});
		t1.setName("t1");
		t1.start();
		System.out.println(t1.getState());
		t1.join();

		System.out.println(t1.getState());

		System.out.println("END " + Thread.currentThread());
		System.out.println(t1.getState());

	}

}
