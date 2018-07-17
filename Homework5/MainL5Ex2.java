package com.mak_keywa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainL5Ex2 {

	static int sum = 0;
	private static int[] input;
	private static Scanner sc;
	private static StringTokenizer st;

	public static void main(String[] args) {
		input = new int[10];
		sc = new Scanner(System.in);
		st = new StringTokenizer(sc.nextLine(), " ");
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		if (input[0] > 0 && input[1] > 0 && input[2] > 0 && input[3] > 0 && input[4] > 0) {
			for (int i = 0; i < 5; i++) {
				sum += input[i];
			}
			System.out.println(sum);
		} else {
			for (int i = 5; i < 10; i++) {
				sum += input[i];
			}
			System.out.println(sum);
		}

	}

}
