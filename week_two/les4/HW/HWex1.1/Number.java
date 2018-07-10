package CW4ex1;
import java.util.Scanner;

public class Number {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		Numbers number1 = new Numbers(sc.nextFloat());
		Numbers number2 = new Numbers(sc.nextFloat());
		Numbers number3 = new Numbers(sc.nextFloat());
		number1.range();
		number2.range();
		number3.range();
	}
}
