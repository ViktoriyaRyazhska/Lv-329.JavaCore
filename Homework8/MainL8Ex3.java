package com.mak_keywa;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainL8Ex3 {
	private static Pattern p;
	private static Scanner sc;
	private static Matcher m;

	public static void main(String[] args) {
		p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		sc = new Scanner(System.in);
		String input = sc.nextLine();
		m = p.matcher(input);
		if (m.matches()) {
			System.out.println(input);
		}
		else {
			System.out.println("Wrong input");
		}
	}
}
