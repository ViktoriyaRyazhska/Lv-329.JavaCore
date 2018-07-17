package com.mak_keywa;

import java.util.Scanner;

public class MainL5Ex1 {
	int input;
	private static Scanner sc;

	public static void main(String[] args) {
		int[] days = new int[12];
		days[0] = 31;
		days[1] = 28;
		days[2] = 31;
		days[3] = 30;
		days[4] = 31;
		days[5] = 30;
		days[6] = 31;
		days[7] = 30;
		days[8] = 31;
		days[9] = 30;
		days[10] = 31;
		days[11] = 30;
		System.out.println("Enter the number of month:");
		MainL5Ex1 m = new MainL5Ex1();
		sc = new Scanner(System.in);
		m.input = Integer.parseInt(sc.nextLine());
		System.out.println(days[m.input - 1]);
	}
}
