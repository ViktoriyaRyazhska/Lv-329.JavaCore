package com.mak_keywa;

import java.util.Scanner;

public class MainL4Ex1 {

	private static Scanner sc;
	float a;
	float b;
	float c;
	boolean res;

	public static void main(String[] args) {
		MainL4Ex1 m = new MainL4Ex1();
		sc = new Scanner(System.in);
		m.a = Math.abs(Float.parseFloat(sc.nextLine()));
		m.b = Math.abs(Float.parseFloat(sc.nextLine()));
		m.c = Math.abs(Float.parseFloat(sc.nextLine()));
		if (m.a<=5 && m.b<=5 && m.c<=5) {
			m.res = true;
		}
		else {
			m.res = false;}
		System.out.println("Result is "+m.res);
		}
}
