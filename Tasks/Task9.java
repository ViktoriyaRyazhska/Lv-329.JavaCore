import java.util.Random;
import java.util.Scanner;

public class Task9 {
	static int time;
	static int res;
	static int[] array;

	public void task9(Scanner sc) {
		System.out.println("Enter number of random generations 1 or 0 and count \"0\":");
		time = sc.nextInt();
		array = new int[time];
		for (int i = 0; i < time; i++) {
			array[i] = random();
			if (array[i] == 1) {
				res++;
			}
		}
		System.out.println("1 was tracked " + res + " times");
	}

	public static int random() {
		Random r = new Random();
		return r.nextInt(2);
	}

}
