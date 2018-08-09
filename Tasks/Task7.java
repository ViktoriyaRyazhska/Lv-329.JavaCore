import java.util.Scanner;

public class Task7 {
	static int input;

	public void task7(Scanner sc) {
		int res = 1;
		System.out.println("Input number  to calculate !n:");
		input = sc.nextInt();
		for (int i = 2; i <= input; i++) {
			res *= i;
		}
		System.out.println("Result is " + res);
	}

}
