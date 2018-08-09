import java.util.Scanner;

public class Task11 {
	static String input;
	static int digit[];

	public void task11(Scanner sc) {
		System.out.println("Enter credit number:");
		input = sc.next();
		digit = new int[16];
		for (int i = 0; i < digit.length; i++) {
			digit[i] = Integer.parseInt(input.substring(i, i + 1));
		}
		System.out.println("Card is valid:" + check(digit));
	}

	public static boolean check(int[] digits) {
		int sum = 0;

		for (int i = 0; i < digits.length; i++) {
			int digit = digits[digits.length - i - 1];
			if (i % 2 == 1) {
				digit *= 2;
			}
			sum += digit > 9 ? digit - 9 : digit;
		}
		return sum % 10 == 0;
	}

}
