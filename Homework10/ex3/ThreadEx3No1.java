package com.mak_keywa;

public class ThreadEx3No1 implements Runnable {

	@Override
	public void run() {
		Runnable r2 = new ThreadEx3No2();
		Thread t2 = new Thread(r2);
		t2.start();
	}
}
