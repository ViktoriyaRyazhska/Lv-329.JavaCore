package com.mak_keywa;

import java.util.Scanner;

public class MainL1Ex2 {
	static String name;
	static String address;
	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("What is your name?");
		sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("Where do you live?");
		address = sc.nextLine();
		System.out.println("You are "+name+". You live in "+address+".");
	}
}
