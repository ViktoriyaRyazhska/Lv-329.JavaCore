import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double Pi = 3.141592654;
        // Task No.1
        System.out.println("Please input the value of the radius of the circle:");
        Double radius = scanner.nextDouble();
        Double perimeter = 2 * Pi * radius;
        Double area = Pi * Math.pow(radius, 2);
        System.out.println("The value of the perimeter of the circle equal: " + perimeter + ".");
        System.out.println("The value of the area of the circle equal: " + area + ".\n");

        // Task No.2
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Where are you live, " + name + "?");
        String address = scanner.next();
        System.out.println("Your name is " + name + ".\nYou live in " + address + ".\n");

        // Task No.3
        System.out.println("Please input the values of the prices in standard units per minute of phone call in three different countries:");
        Double c1 = scanner.nextDouble();
        Double c2 = scanner.nextDouble();
        Double c3 = scanner.nextDouble();
        System.out.println("Please input the values of the duration in minutes of the phone call in three different countries:");
        Double t1 = scanner.nextDouble();
        Double t2 = scanner.nextDouble();
        Double t3 = scanner.nextDouble();
        Double variable1 = c1 * t1;
        Double variable2 = c2 * t2;
        Double variable3 = c3 * t3;
        Double variable4 = (c1 * t1) + (c2 * t2) + (c3 * t3);
        System.out.println("The value of the " + t1 + " minute/s phone call in first country equal: " + variable1 + " standard units.");
        System.out.println("The value of the " + t2 + " minute/s phone call in second country equal: " + variable2 + " standard units.");
        System.out.println("The value of the " + t3 + " minute/s phone call in third country equal: " + variable3 + " standard units.");
        System.out.println("The value of the all phone calls equal: " + variable4 + " standard units.");
    }
}