import java.util.Scanner;

public class Task2 {
	static Scanner sc = new Scanner(System.in);

	public static void task2() {
		System.out.println("2.Input number for decompose this number into"
				+ " a product of prime numbers with their degrees : ");
		int k = 2;
		int n = sc.nextInt();
		System.out.print("product of prime numbers: ");
		while (n > 1) {
			if (n % k == 0) {
				System.out.print(k + ", ");
				n = n / k;
			} else {
				k = k + 1;
			}
		}
		System.out.println();
	}
}
