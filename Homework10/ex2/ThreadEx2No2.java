package com.mak_keywa;

public class ThreadEx2No2 implements Runnable {
	public void run() {
		synchronized (MainL10Ex2.second) {
			Thread.yield();
			synchronized (MainL10Ex2.first) {
				System.out.println("Success!");
			}
		}
	}

}
