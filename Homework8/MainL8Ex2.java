package com.mak_keywa;

import java.util.Scanner;

public class MainL8Ex2 {

	private static String input;
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		input = sc.nextLine();
		input = input.replaceAll("[ ]{2,}", " ");
		System.out.println(input);
	}
}
