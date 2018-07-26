package com.mak_keywa;

import java.util.Scanner;

public class MainL9Ex1 {
	static double a;
	static double b;
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		try {
			a = sc.nextDouble();
			b = sc.nextDouble();
		} catch (Exception e) {
			System.out.println("Wrong input");
		}
		
		if (b != 0) {
			try {
				System.out.println("Result = " + div(a, b));
			} catch (Exception e) {
				System.out.println("Wrong input");
			} 
		}
		else {
			System.out.println("Cannot divide 0");
		}
	}

	static double div(double a2, double b2) {
		return a2 / b2;
	}
}