import java.util.Scanner;
import java.util.StringTokenizer;

public class Task3 {
	static String input;
	static int rate;
	static int amouth;
	static int dollar;
	static int change;
	
	public void task3(Scanner sc) {
		System.out.println("Input cost of dollar and sum of money in gryvna:");
		input = sc.next();
		StringTokenizer st = new StringTokenizer(input, " ");
		rate = Integer.parseInt(st.nextToken());
		amouth = Integer.parseInt(st.nextToken());
		dollar = amouth/rate;
		change = amouth%rate;
		System.out.println();
	}

}
