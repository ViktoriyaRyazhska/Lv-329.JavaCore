package com.mak_keywa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cleaner extends Stuff {

	public Cleaner() {
	}

	public Cleaner(String name, int hours) {
		super(name, hours);
	}

	@Override
	public int calculateSalary() throws SomeExeption {
		return this.getHours() * 10;
	}

	@Override
	public void input(Scanner sc) {
		System.out.println("Enter name of Cleaner:");
		String nametemp = sc.next();
		Pattern namepat = Pattern.compile("[A-Za-z]{3,}");
		Matcher namemat = namepat.matcher(nametemp);
		if (namemat.matches()) {
			this.setName(nametemp);
			System.out.println("Success!");
		} else {
			System.err.println("Wrong input");
		}
		System.out.println("Enter hours of Cleaner:");
		int hourtemp = sc.nextInt();
		if (hourtemp >= 0) {
			this.setHours(hourtemp);
			System.out.println("Success!");
		} else {
			System.err.println("Wrong input");
		}
		System.out.println("You created Cleaner " + this.getName() + " works " + this.getHours() + " hours.");
	}

	@Override
	public void input(String file) throws IOException {
		if (this.getName() != null) {
			FileWriter filewriter = new FileWriter(file);
			filewriter.write(this.getName() + " " + this.getHours());
			filewriter.close();
			System.out.println("Info about Cleaner " + this.getName() + " was saved!");
		} else {
			System.err.println("Please input all info about Cleaner before saving it in file");
		}

	}

	@Override
	public void print() {
		System.out.println("Cleaner " + this.getName() + " works " + this.getHours() + " hours.");
	}

	
	public static void print(String File) throws IOException {
		Scanner sc = new Scanner(new File(File));
		StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
		System.out.println("Cleaner " + st.nextToken() + " works " + st.nextToken() + " hours.");
		sc.close();
	}

	@Override
	public String toString() {
		return "Cleaner [name=" + this.getName() + ", hours=" + this.getHours() + "]";
	}

}
