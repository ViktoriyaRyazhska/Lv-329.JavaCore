import java.util.Scanner;

public class Task7 {
	
	public static void task7() {
		System.out.println("7.Input number n for calculate n!:");
		Scanner scanner = new Scanner(System.in);
		Integer variable = scanner.nextInt();
		Integer variable0 = 1;
		for (Integer variableLoopCounter = 2; variableLoopCounter <= variable; variableLoopCounter++) {
			variable0 *= variableLoopCounter;
		}
		System.out.println(variable0);
	}
}