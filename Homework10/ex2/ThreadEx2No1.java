package com.mak_keywa;

public class ThreadEx2No1 implements Runnable {
	public void run() {
		synchronized (MainL10Ex2.first) {
			Thread.yield();
			synchronized (MainL10Ex2.second) {
				System.out.println("Success!");
			}
		}
	}
}
