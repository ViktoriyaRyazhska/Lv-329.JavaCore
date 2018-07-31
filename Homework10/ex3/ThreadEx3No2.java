package com.mak_keywa;

public class ThreadEx3No2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
		Runnable r3 = new ThreadEx3No3();
		Thread t3 = new Thread(r3);
		t3.start();
	}
}
