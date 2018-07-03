import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws IOException {
        String t = "";
        boolean isTrue = false;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Hello, select task from homework_1");
            System.out.println("Input 1 for task 1\nInput 2 for task 2\nInput 3 for task 2\nInput 0 for exit");
            t = s.nextLine();
            switch (t) {
                case "1":
                    task1();
                    System.out.println("------------------");
                    break;
                case "2":
                    task2();
                    System.out.println("------------------");
                    break;
                case "3":
                    task3();
                    System.out.println("------------------");
                    break;
                case "0":
                    isTrue = true;
                    break;
                default:
                    try{
                    System.out.println("Please enter valid comand=)\n");
                    System.out.println("------------------");}
                    catch (InputMismatchException e) {
                        System.out.println("Please enter valid comand=)\n");
                        System.out.println("------------------");
                    }
            }
        } while (!isTrue);
    }

    private static void task1() throws IOException {
        double r, p, s;
        System.out.println("Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius.\n Output obtained results.");
        System.out.println("Input radius");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        r = Double.parseDouble(br.readLine());
        p = 2 * Math.PI * r;
        s = Math.PI * Math.pow(r, 2);
        System.out.printf("Perimetr is " + "%.2f", p);
        System.out.printf("\nArea is " + "%.2f", s);
        System.out.println();
    }

    private static void task2() {
        String name, address;
        Scanner s = new Scanner(System.in);
        System.out.println("Define String variables name and address. Output question \"What is your name?\" Read the value\n" +
                "name and output next question: “Where are you live, (name)?\". Read address and write whole\n" +
                "information.");
        System.out.println("What is your name?");
        name = s.nextLine();
        System.out.println("Where are you live, " + name + "?");
        address = s.nextLine();
        System.out.println(name + ", you live in " + address + "? Really?");
    }

    private static void task3() {
        double c1, c2, c3, t1, t2, t3, sum, ct1, ct2, ct3;
        System.out.println("Phone calls from three different countries are с1, с2 and с3 standard units per minute. Talks\n" +
                "continued t1, t2 and t3 minutes. How much computer will count for each call separately and all talk\n" +
                "together? Input all source data from console, make calculations and output to the screen.");
        Scanner s = new Scanner(System.in);
        System.out.println("Input units per minute for first country, and time of conversatioin.");
        c1 = Double.parseDouble(s.nextLine());
        t1 = Double.parseDouble(s.nextLine());

        System.out.println("Input units per minute for second country, and time of conversatioin.");
        c2 = Double.parseDouble(s.nextLine());
        t2 = Double.parseDouble(s.nextLine());

        System.out.println("Input units per minute for third country, and time of conversatioin.");
        c3 = Double.parseDouble(s.nextLine());
        t3 = Double.parseDouble(s.nextLine());

        ct1 = c1 * t1;
        ct2 = c2 * t2;
        ct3 = c3 * t3;
        sum = ct1 + ct2 + ct3;

        System.out.println("You conversation cost in\n first country is " + ct1
                + "\n second country is " + ct2
                + "\n third country is " + ct3
                + ".\nCost of all conversation is " + sum);
    }
}
