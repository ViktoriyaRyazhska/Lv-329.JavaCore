package com.mak_keywa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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

		try {
			company.get(5).input(progfile);
			company.get(8).input(cleafile);
		} catch (IOException e) {
			System.err.println("File not found");
		}
		
		System.out.println();
		
		try {
			Programer.print(progfile);
			Cleaner.print(cleafile);
		} catch (IOException e) {
			System.err.println("File not found");
		}
		
		System.out.println();
		
		Collections.sort(company, new salaryComparator());
		for (Stuff st1 : company) {
			try {
				System.out.println(st1.toString() + "  Salary: "+st1.calculateSalary());
			} catch (SomeExeption e) {
				System.err.println("Error in sorting. Check if all info has been set.");
			}
		}
	}
}
