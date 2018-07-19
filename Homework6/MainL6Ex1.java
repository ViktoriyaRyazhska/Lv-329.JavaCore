package com.mak_keywa;

public class MainL6Ex1 {

	private static Bird[] zoo;

	public static void main(String[] args) {
		zoo = new Bird[10];
		zoo[0] = new Eagle();
		zoo[1] = new Eagle();
		zoo[2] = new Swallow();
		zoo[3] = new Swallow();
		zoo[4] = new Swallow();
		zoo[5] = new Penguin();
		zoo[6] = new Chicken();
		zoo[7] = new Chicken();
		zoo[8] = new Eagle();
		zoo[9] = new Chicken();
		for (int i = 0; i < zoo.length; i++) {
			zoo[i].fly();
		}

	}

}
