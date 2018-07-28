import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);

    private static double div(double a, double b) {
        return a / b;
    }

    public static void main(String args[]) {

        System.out.println("Enter a and b");
        try {
            double a = s.nextDouble();
            double b = s.nextDouble();
            if (b == 0) {
                System.out.println("Div by zero");
            } else {
                System.out.printf("Result of dividing :%.2f" ,div(a, b));
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input!");
        }
        System.out.println("Enter 10 numbers");
        readNumber(1, 100);
    }

    private static void readNumber(int start, int end) {
        System.out.println("Enter number ");
        for (int i = 0; i < 10; i++) {
            try {
                int n = s.nextInt();
                System.out.println((n >= start && n <= end) ? "Your number is in range." : "Your number out of range");
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }
}
