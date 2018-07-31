package com.mak_keywa;

public class MainL10Ex1 {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new ThreadEx1No1();
		Thread t1 = new Thread(r1);
		Runnable r2 = new ThreadEx1No2();
		Thread t2 = new Thread(r2);
		Runnable r3 = new ThreadEx1No3();
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t2.join();
		t2.join();
		t3.start();
	}

}
