package com.mak_keywa;

import java.util.Scanner;

public class MainL5Ex4 {

	private static Scanner sc;
	int input;
	private static Car[] cars;
	private static Car[] moderncars;
	private static Car temp;

	public static void main(String[] args) {
		cars = new Car[4];
		MainL5Ex4 m = new MainL5Ex4();
		cars[0] = new Car("type1", 2000, 1.5);
		cars[1] = new Car("type2", 2003, 2);
		cars[2] = new Car("type3", 2000, 2.5);
		cars[3] = new Car("type4", 2003, 2);
		sc = new Scanner(System.in);
		m.input = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getYear() == m.input) {
				System.out.println("" + i + " car was made in " + m.input + ".");
			}
		}
		moderncars = new Car[4];
		moderncars[0] = new Car("type1", 2005, 1.5);
		moderncars[1] = new Car("type2", 2002, 2);
		moderncars[2] = new Car("type3", 2008, 2.5);
		moderncars[3] = new Car("type4", 2001, 2);
		temp = new Car();
		for (int i = 0; i < moderncars.length; i++) {
			for (int k = 0; k < moderncars.length; k++) {
				if (moderncars[i].getYear() < moderncars[k].getYear()) {
					temp = moderncars[i];
					moderncars[i] = moderncars[k];
					moderncars[k] = temp;
				}
			}
		}
		for (int i = 0; i < moderncars.length; i++) {
			System.out.println(moderncars[i]);
		}
	}
}
