package com.mak_keywa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainL10Ex4 {
	static String fileNameout = "src/text1.txt";
	static String fileNamein = "src/text2.txt";
	private static Scanner sc;
	private static List<String> line;
	private static String[] arr;
	private static FileWriter fw;

	public static void main(String[] args) {
		try {
			sc = new Scanner(new File(fileNameout));
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
		}
		line = new ArrayList<String>();
		while (sc.hasNextLine()) {
			line.add(sc.nextLine());
		}
		arr = line.toArray(new String[0]);
		try {
			fw = new FileWriter(fileNamein);
		} catch (IOException e) {
			System.err.println("File not found!");
		}
		Arrays.sort(arr, new StringLengthComparator());
		try {
			fw.write("Number of lines - " + arr.length + "\n");
			fw.write("The longest line is - " + arr[0] + "\n");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		try {
			fw.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		sc.close();
	}

}
