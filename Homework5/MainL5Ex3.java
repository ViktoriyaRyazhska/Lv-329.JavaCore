package com.mak_keywa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainL5Ex3 {
	static int[] input;
	private static Scanner sc;
	int possecposnum;
	int minnum;
	int minposnum;
	int count;
	private static int[] input2;

	public static void main(String[] args) {
		MainL5Ex3 m = new MainL5Ex3();
		input = new int[5];
		sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		m.count = 0;
		m.minnum = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				m.count++;
			}
			if (m.count == 2) {
				m.possecposnum = i + 1;
				break;
			}
		}
		for (int i = 0; i < input.length; i++) {
			if (input[i] < m.minnum) {
				m.minnum = input[i];
				m.minposnum = i;
			}
		}
		System.out.println("Position of second positive number is " + m.possecposnum + ".");
		System.out.println("Minimum is " + m.minnum + " in position " + m.minposnum + " of array.");
		// Реалізація додаткового завдання:"Organize entering integers until the first
		// negative number. Count the product of all entered even numbers."
		input2 = new int[5];
		sc = new Scanner(System.in);
		int i;
		int term;
		for (i = 0; i < input2.length; i++) {
			term = Integer.parseInt(sc.nextLine());
			if (term < 0) {
				break;
			}
			input2[i] = term;
		}
		int product = 1;
		for (int i2 = 0; i2 < i; i2++) {
			if (input2[i2] % 2 == 0) {
				product = product * input2[i2];
			}
		}
		System.out.println("Product of all even numbers is " + product + ".");
	}
}
