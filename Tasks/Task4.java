
import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
	public void task4(BufferedReader br) throws IOException {
		System.out.println(
				"Input string and calculate number of loud letters (e.g. word: “My test text”, result: 3)");
		String text = br.readLine();
		int count = 0;
		Pattern pattern = Pattern.compile("[aeioy]+");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			count++;
		}
		System.out.println(count);
	}
}
