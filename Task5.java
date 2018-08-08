import java.util.Scanner;

public class Task5 {

	static Scanner  sc = new Scanner(System.in);

	public static void task5() {

		String a = "";
		String b = "";

		System.out.println("Enter the string you want to check is palindrome:");
		a = sc.nextLine();
		int n = a.length();
		for (int i = n - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equalsIgnoreCase(b)) {
			System.out.println("The string is palindrome.");
		} else {
			System.out.println("The string is not palindrome.");
		}

	}

}
