import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int i;
		while (true) {
			System.out.println("Input number task\n1-14, 0-exit");
			i = sc.nextInt();
			switch (i) {
			case 1: 
				Task1.task1();
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
				Task6.task6();
				break;
			case 7:
				Task7.task7();
				break;
			case 8:
				Task8.task8();
				break;
			case 9:
				Task9.task9();
				break;
			case 10:
				Task10.task10();
				break;
			case 11:
				Task11.task11();
				break;
			case 12:
				Task12.task12();
				break;
//			case 13:
//				Task13.task13();
//				break;
//			case 14:
//				Task14.task14();
//				break;
			case 0:
				System.exit(0);
			}

		}

	}

}
