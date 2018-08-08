import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Task6 {
    static String input;

    public void task6(BufferedReader br) throws IOException {
        System.out.println("Input text and calculate number of words in this text");
        input = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(input," ");
        System.out.println(stringTokenizer.countTokens());
    }
}
