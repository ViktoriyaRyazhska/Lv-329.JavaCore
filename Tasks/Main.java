import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws IOException {
		Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
			Task3 t3 = new Task3();
			t3.task3(s);
			break;
		case 4:
			 Task4 t4 = new Task4();
			 t4.task4(br);
			break;
		case 5:
			Task5 t5 = new Task5();
			t5.task5(s);
			break;
		case 6:
			// Task6 t6= new Task6();
			// t6.task6(s);
			break;
		case 7:
			// Task4 t4 = new Task4();
			// t4.task4(s);
			break;
		case 8:
			// Task4 t4 = new Task4();
			// t4.task4(s);
			break;
		case 9:
			// Task4 t4 = new Task4();
			// t4.task4(s);
			break;
		case 10:
			// Task4 t4 = new Task4();
			// t4.task4(s);
			break;
		case 11:
			// Task4 t4 = new Task4();
			// t4.task4(s);
			break;
		case 12:
			// Task4 t4 = new Task4();
			// t4.task4(s);
			break;
		case 13:
			// Task4 t4 = new Task4();
			// t4.task4(s);
			break;
		case 14:
			// Task4 t4 = new Task4();
			// t4.task4(s);
			break;
		}
	}
}
