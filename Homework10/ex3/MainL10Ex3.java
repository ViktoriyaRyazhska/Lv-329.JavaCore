package com.mak_keywa;

public class MainL10Ex3 {

	public static void main(String[] args) {
		Runnable r1 = new ThreadEx3No1();
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
