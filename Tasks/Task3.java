import java.util.Scanner;

public class Task3 {
	static String input;
	static double rate;
	static int amouth;
	static int dollar;
	static double change;

	public void task3(Scanner sc) {
		System.out.println("Input cost of dollar and sum of money in gryvna:");
		rate = sc.nextDouble();
		amouth = sc.nextInt();
		dollar = (int) (amouth / rate);
		change = amouth % rate;
		System.out.println("You can buy " + dollar + " dollars with " + change + " in change");
	}

}
