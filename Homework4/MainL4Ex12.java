package com.mak_keywa;

import java.util.Scanner;

public class MainL4Ex12 {
	
	private static Scanner sc;
	int error;
	String type;
	private static MainL4Ex12 m;

	public static void main(String[] args) {
		m = new MainL4Ex12();
		sc = new Scanner(System.in);
		m.error = Integer.parseInt(sc.nextLine());
		m.type = "E"+m.error;
		HTTPError er =HTTPError.valueOf(m.type);
		System.out.println(er.getDescription());
		
	}
}
