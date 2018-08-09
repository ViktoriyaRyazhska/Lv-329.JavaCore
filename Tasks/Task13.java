import java.util.Scanner;

public class Task13 {
	static int result;

	public void task13(Scanner sc) {
		for (int i = 2520; i < 300000000; i += 20) {
			for (int j = 1; j < 21; j++) {
				if (i % j == 0) {
					result++;
				}
			}
			if (result == 20) {
				System.out.println(i + " is number that can be divided by 1-20");
				break;
			}
			result = 0;
		}
	}
}
