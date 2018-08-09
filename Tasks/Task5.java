import java.util.Scanner;

public class Task5 {
	static String input;
	static char a;
	static char b;
	static int j;
	static boolean result = true;

	public void task5(Scanner sc) {
		System.out.println("Input word to check for palindrome:");
		input = sc.next();
		for (int i = 0; i < input.length() / 2; i++) {
			j = input.length() - i - 1;
			a = input.charAt(i);
			b = input.charAt(j);
			if (a != b) {
				result = false;
			}

		}
		System.out.println("Result is " + result);
	}

}
