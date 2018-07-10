package com.mak_keywa;

import java.util.Scanner;

public class MainL4Ex11 {
	
	int a;
	int b;
	int c;
	int max;
	int min;
	private static Scanner sc;

	public static void main(String[] args) {
		MainL4Ex11 m = new MainL4Ex11();
		sc = new Scanner(System.in);
		m.a = Integer.parseInt(sc.nextLine());
		m.b = Integer.parseInt(sc.nextLine());
		m.c = Integer.parseInt(sc.nextLine());
		m.max = Math.max(m.a, Math.max(m.b, m.c));
		m.min = Math.min(m.a, Math.min(m.b, m.c));
		System.out.println("Max = "+m.max+".");
		System.out.println("Min = "+m.min+".");
	}
}
