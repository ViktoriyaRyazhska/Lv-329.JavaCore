package com.mak_keywa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainL1Ex3 {
	static String input1;
	static String input2;
	static int c1;
	static int c2;
	static int c3;
	static int t1;
	static int t2;
	static int t3;
	static int r1;
	static int r2;
	static int r3;
	static int rtotal;
	private static Scanner sc;
	private static StringTokenizer st1;
	private static StringTokenizer st2;

	public static void main(String[] args) {
		System.out.println("Enter standards:");
		// Input like "c1 c2 c3" and "t1 t2 t3"
		sc = new Scanner(System.in);
		input1 = sc.nextLine();
		System.out.println("Enter durations:");
		input2 = sc.nextLine();
		st1 = new StringTokenizer(input1, " ");
		c1 = Integer.parseInt(st1.nextToken());
		c2 = Integer.parseInt(st1.nextToken());
		c3 = Integer.parseInt(st1.nextToken());
		st2 = new StringTokenizer(input2, " ");
		t1 = Integer.parseInt(st2.nextToken());
		t2 = Integer.parseInt(st2.nextToken());
		t3 = Integer.parseInt(st2.nextToken());
		r1 = c1 * t1;
		r2 = c2 * t2;
		r3 = c3 * t3;
		rtotal = r1 + r2 + r3;
		System.out.println("Result: "+r1+", "+r2+", "+r3+", "+rtotal+".");
	}
}
