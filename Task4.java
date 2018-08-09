import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	public static void task4() {

		System.out.println("4.Input string for calculate number of loud letters");
		String str = Main.sc.nextLine();
		int count = 0;

		Pattern p = Pattern.compile("[aeiouy]");
		Matcher m = p.matcher(str);

		while (m.find()) {
			count++;
		}

		System.out.println("result: " + count);

	}

}
