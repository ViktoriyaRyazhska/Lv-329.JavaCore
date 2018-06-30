package com.mak_keywa;

import java.util.Scanner;

public class MainL1Ex1 {
	static int r;
	static double p;
	static double s;

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("Enter the radius:");
		sc = new Scanner(System.in);
		r = Integer.parseInt(sc.nextLine());
		p = 6.28*r;
		s = 3.14*r*r;
		System.out.println("Perimeter = "+p);
		System.out.println("Area = "+s);
	}
}
