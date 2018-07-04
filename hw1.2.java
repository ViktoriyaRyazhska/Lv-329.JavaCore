package second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Hello. What is your name?");

		String name = br.readLine();

		System.out.println("Where do you live, " + name + "?");

		String adress = br.readLine();

		System.out.println("Hello " + name);

		System.out.println("You are living here: " + adress);

	}

}

