import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Select task number");
        switch (s.nextInt()) {
            case 1:
            	Task1 t1 = new Task1();
            	t1.task1();
                break;
            case 2:
            	Task2 t2 = new Task2();
            	t2.task2(s);
                break;
            case 3:

                break;

            default:

        }
    }
}
