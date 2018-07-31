package com.mak_keywa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainL9Ex2 {
	static int res;
	private static Scanner sc;
	private static int[] a;

	public static void main(String[] args) {
		a = new int[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			a[i] = r.nextInt(100);
		}
		Arrays.sort(a);
		for (int i = 0; i < 8; i++) {
			try {
				System.out.println("You need to enter number between " + a[i] + " and " + a[i + 1] + ":");
				System.out.println(readNumber(a[i], a[i + 1]));
			} catch (ErrorException e) {
				System.err.println(e.getMessage());
			}
		}
		try {
			System.out.println(readNumber(a[0], a[9]));
		} catch (ErrorException e) {
			System.err.println(e.getMessage());
		}

	}

	static int readNumber(int start, int end) throws ErrorException {
		sc = new Scanner(System.in);
		try {
			res = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Wrong input");
		}
		if (res >= start && res <= end) {
			return res;
		} else {
			throw new ErrorException("Invalid number");
		}

	}
}