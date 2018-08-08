import java.util.Scanner;

public class Task7 {
	static int input;
	static int res = 1;

	public void task7(Scanner sc) {
		System.out.println("Input number  to calculate !n:");
		input = sc.nextInt();
		for (int i = 2; i <= input; i++) {
			res *= i;
		}
		System.out.println("Result is " + res);
	}

}
