package com.mak_keywa;

public class ThreadEx1No3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 3 is working.");
		}
	}
}
