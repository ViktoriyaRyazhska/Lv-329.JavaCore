import java.util.Scanner;

public class Task6 {

	Scanner sc = new Scanner(System.in);

	public void task6() {
		System.out.println("Input text for calculate number of words in this text");
		String str = sc.nextLine();
		String[] strM = str.split(" ");

		System.out.println("number of words in this text: "+ strM.length);
		
	}
}
