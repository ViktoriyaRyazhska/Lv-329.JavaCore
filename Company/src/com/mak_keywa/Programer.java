package com.mak_keywa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.*;

public class Programer extends Stuff {
	private ProgerRank rank;

	public Programer() {
	}

	public Programer(String name, int hours) {
		super(name, hours);
	}

	public Programer(String name, int hours, ProgerRank rank) {
		super(name, hours);
		this.rank = rank;
	}

	@Override
	public int calculateSalary() throws SomeExeption {
		switch (rank) {
		case Junior:
			return this.getHours() * 15;
		case Medium:
			return this.getHours() * 20;
		case Senior:
			return this.getHours() * 25;
		default:
			throw new SomeExeption("Unknown rank of programmer");
		}
	}

	@Override
	public void input(Scanner sc) {
		System.out.println("Enter name of Programmer:");
		String nametemp = sc.nextLine();
		Pattern namepat = Pattern.compile("[A-Za-z]{3,}");
		Matcher namemat = namepat.matcher(nametemp);
		if (namemat.matches()) {
			this.setName(nametemp);
			System.out.println("Success!");
		} else {
			System.err.println("Wrong input");
			
		}
		System.out.println("Enter hours of Programmer:");
		int hourtemp = sc.nextInt();
		if (hourtemp >= 0) {
			this.setHours(hourtemp);
			System.out.println("Success!");
		} else {
			System.err.println("Wrong input");
		}
		System.out.println("Enter number of Programmer's rank (Junior - 1, Medium - 2, Senior - 3):");
		switch (sc.nextInt()) {
		case 1:
			this.setRank(ProgerRank.Junior);
			break;
		case 2:
			this.setRank(ProgerRank.Medium);
			break;
		case 3:
			this.setRank(ProgerRank.Senior);
			break;
		}
		System.out.println("You created Programmer " + this.getName() + " " + this.getRank() + " works "
				+ this.getHours() + " hours.");
	}

	@Override
	public void input(String file) throws IOException {
		if (this.getName() != null || this.getRank() != null) {
			FileWriter filewriter = new FileWriter(file);
			filewriter.write(this.getName() + " " + this.getRank() + " " + this.getHours());
			filewriter.close();
			System.out.println("Info about Programmer " + this.getName() + " was saved!");
		} else {
			System.err.println("Please input all info about Programmer before saving it in file");
		}
	}

	@Override
	public void print() {
		System.out.println(
				"Programmer " + this.getName() + " " + this.getRank() + " works " + this.getHours() + " hours.");
	}

	public void print(String File) throws IOException {
		Scanner sc = new Scanner(new File(File));
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		System.out.println(
				"Programmer " + st.nextToken() + " " + st.nextToken() + " works " + st.nextToken() + " hours.");
		sc.close();
	}

	@Override
	public String toString() {
		return "Programer [name=" + this.getName() + ", hours=" + this.getHours() + ", rank=" + this.getRank() + "]";
	}

	public ProgerRank getRank() {
		return rank;
	}

	public void setRank(ProgerRank rank) {
		this.rank = rank;
	}

}
