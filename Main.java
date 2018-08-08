import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		while (true) {
			System.out.println("Input number task");
			i = sc.nextInt();
			switch (i) {
			case 1: // task1();
				break;
			case 2:
				Task2.task2();
				break;
			case 3:
				Task3.task3();
				break;
			case 4:
				Task4.task4();
				break;
			case 5:
				Task5.task5();
				break;
			case 6:
				Task5.task5();
				break;
			case 7:
				Task5.task5();
				break;
			case 8:
				Task5.task5();
				break;
			case 9:
				Task5.task5();
				break;
			case 10:
				Task5.task5();
				break;
			case 11:
				Task5.task5();
				break;
			case 12:
				Task5.task5();
				break;
			case 0:
				System.exit(0);
			}

		}
//		Task11 t = new Task11();
//		t.task11();

	}

}
