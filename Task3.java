import java.util.Scanner;

public class Task3 {

	static Scanner sc = new Scanner(System.in);

	public static  void task3() {
		System.out.println("Input cost of dollar");
		int dollar = sc.nextInt();
		System.out.println("Input sum of money in gryvna");
		int gryvna = sc.nextInt();

		int buy = gryvna / dollar;
		int rest = gryvna % dollar;
		System.out.println("User can buy and change " + buy + " dollars and rest " + rest + " gryvna.");
	}

}
