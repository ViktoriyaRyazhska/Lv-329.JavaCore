package HW8ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneSpace {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();

		String[] a = text.split("[\\s]+");
		for (String n : a)
			System.out.print(n + " ");
	}

}
