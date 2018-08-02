package com.mak_keywa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyMain {
	private static List<Stuff> company;
	final static String progfile = "CProger.txt";
	final static String cleafile = "Cleaner.txt";

	public static void main(String[] args) {
		company = new ArrayList<Stuff>();
		Scanner sc = new Scanner(System.in);
		company.add(new Programer("Vasya", 150, ProgerRank.Junior));
		company.add(new Programer("Olga", 200, ProgerRank.Junior));
		company.add(new Programer("Marta", 160, ProgerRank.Medium));
		company.add(new Programer("Maria", 210, ProgerRank.Medium));
		company.add(new Programer("Ostap", 170, ProgerRank.Senior));
		company.add(new Programer());
		company.get(5).input(sc);

		company.add(new Cleaner("Nadya", 80));
		company.add(new Cleaner("Nina", 100));
		company.add(new Cleaner());

		company.get(8).input(sc);
		sc.close();

		// try {
		// company.get(2).input(progfile);
		// company.get(7).input(cleafile);
		// } catch (IOException e) {
		// System.err.println("File not found");
		// }

		// Stuff temp1 = new Programer();
		// Stuff temp2 = new Cleaner();
		// try {
		// temp1.print(progfile);
		// temp2.print(cleafile);
		// } catch (IOException e) {
		// System.err.println("File not found");
		// }
	}
}
