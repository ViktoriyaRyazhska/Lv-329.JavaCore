package com.mak_keywa;

public class MainL10Ex2 {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String[] args) {
		Runnable r1 = new ThreadEx2No1();
		Runnable r2 = new ThreadEx2No2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
