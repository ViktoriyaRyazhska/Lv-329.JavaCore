package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args []) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input sentence");
        String sentence = br.readLine();
        br.close();
        Pattern pattern = Pattern.compile("\\$[0-9]+\\.[0-9]{2}");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find())
            System.out.println(sentence.substring(matcher.start(), matcher.end()));
    }
}
