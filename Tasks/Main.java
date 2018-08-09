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
			Task6 t6 = new Task6();
			t6.task6(br);
			break;
		case 7:
			Task7 t7 = new Task7();
			t7.task7(s);
			break;
		case 8:
			// Task8 t8= new Task8();
			// t8.task8(s);
			break;
		case 9:
			Task9 t9 = new Task9();
			t9.task9(s);
			break;
		case 10:
			// Task10 t10 = new Task10();
			// t10.task10(s);
			break;
		case 11:
			Task11 t11 = new Task11();
			t11.task11(s);
			break;
		case 12:
			// Task12 t12 = new Task12();
			// t12.task12(s);
			break;
		case 13:
			Task13 t13 = new Task13();
			t13.task13(s);
			break;
		case 14:
			// Task14 t14 = new Task14();
			// t14.task14(s);
			break;
		}
	}
}
