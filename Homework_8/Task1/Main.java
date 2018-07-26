package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input sentence");
        String sentence = br.readLine();
        br.close();
        String[] arrSentence = sentence.split(" ");
        String longestWord = "";
        for (String anArrSentence1 : arrSentence) {
            if (anArrSentence1.length() > longestWord.length()) {
                longestWord = anArrSentence1;
            }
        }
        System.out.println("Longest worfd " + longestWord + " it contains " + longestWord.length() + " symbols.");
        StringBuilder stringBuilder = new StringBuilder(arrSentence[1]);
        String reversWord = stringBuilder.reverse().toString();
        System.out.println("Revers of second word : " + reversWord);
    }
}
