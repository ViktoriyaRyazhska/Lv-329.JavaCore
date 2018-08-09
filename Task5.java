public class Task5 {

	public static void task5() {

		String a = "";
		String b = "";

		System.out.println("Enter the string you want to check is palindrome:");
		a = Main.sc.nextLine();
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
