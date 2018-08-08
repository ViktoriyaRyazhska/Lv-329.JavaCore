import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
	private static Scanner sc;
	static int input = 0;

	public void task2(Scanner sc) {
		input = sc.nextInt();
		System.out.println(primeFactors(input));
	}
	public static List<Integer> primeFactors(int number) {
        int n = number;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
