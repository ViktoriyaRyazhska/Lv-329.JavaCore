import java.util.Scanner;

public class Main {
    public static void main (String args []) {
        Tasks tasks = new Tasks();
        Scanner s = new Scanner(System.in);
        System.out.println("Select task");
        int t = s.nextInt();
        switch (t) {
            case 1:
                tasks.task1();
                break;
            case 2:
                tasks.task2();
                break;
            default:
                System.out.println("Enter valid data!");
        }
    }
}
