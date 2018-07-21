package com.mak_keywa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MainL8Ex1 {
	private static String input;
	static String[] words;
	private static Scanner sc;
	private static StringTokenizer st;

	public static void main(String[] args) {
		words = new String[5];
		sc = new Scanner(System.in);
		input = sc.nextLine();
		st = new StringTokenizer(input, " ");
		for (int i = 0; i < 5; i++) {
			words[i] = st.nextToken();
		}
		int maxLength = words[0].length();
		int pos = 0;
		for (int i = 1; i < words.length; i++) {
			if (words[i].length() > maxLength) {
				pos = i;
				maxLength = words[i].length();
			}
		}
		System.out.println("The longest word is " + words[pos] + " in position " + (pos + 1) + ".");
		System.out.println("Second word in reverse order is " +words[words.length-2]);
//		for (int i = 0; i < words.length / 2; i++) {
//			String temp = words[i];
//			words[i] = words[words.length - i - 1];
//			words[words.length - i - 1] = temp;
//		}
//		System.out.println("Second word in reverse order is " +words[1]);
	}
}
