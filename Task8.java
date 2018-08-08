import java.util.Scanner;

public class Task8 {

	public static void task8() {
		System.out.println("Please input the value of the variable:");
		Scanner scanner = new Scanner(System.in);
		Integer variable = scanner.nextInt();
		switch (variable.toString().length()) {
		case 7: {
			System.out.print((variable / 1000000) + " Millions ");
		}
		case 6: {
		}
		case 5: {
		}
		case 4: {
			System.out.print(((variable % 1000000) / 1000) + " Thousands ");
		}
		case 3: {
		}
		case 2: {
		}
		case 1: {
			System.out.println(((variable % 1000)));
			break;
		}
		}
	}
}