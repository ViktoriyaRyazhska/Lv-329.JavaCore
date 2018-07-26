package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args []) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input sentence");
        String sentence = br.readLine();
        br.close();
        System.out.println(sentence.replaceAll("[ ]+ "," "));
    }
}
