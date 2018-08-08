import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	static Scanner sc = new Scanner(System.in);

	public static void task4() {
		String str = sc.nextLine();
		int count = 0;

		Pattern p = Pattern.compile("[aeiouy]");
		Matcher m = p.matcher(str);

		while (m.find()) {
			count++;
		}

		System.out.println(count);

	}

}
