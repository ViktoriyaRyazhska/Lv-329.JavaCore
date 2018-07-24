package homework8.Task1;

import java.lang.*;
import java.io.*;

public class task1 {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter in the console sentence of five words. \n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String h = br.readLine();
        String[] words = h.split("\\s*(\\s|,|!|\\.)\\s*");
        int indexLonWord = 0;
        for (int i = 0; i < words.length; i++){
            if(words[i].length() > words[indexLonWord].length()){
                indexLonWord = i;
            }
        }
        System.out.println("Longest word in the sentence:");
        System.out.println(words[indexLonWord]);
        System.out.println("The number of its letters:");
        System.out.println(words[indexLonWord].length());
        System.out.println("Second word in reverse:");
        StringBuffer strBuffer = new StringBuffer(words[1]);
        System.out.println(strBuffer.reverse());

    }
}
