package homework8.Task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a sentence that contains the words between more than one space:");

        String str = in.nextLine();
        String str2 = "";
        String[] words = str.split("\\s*(\\s|,|!|\\.)\\s*");

        for (String word : words){
            str2 += word + " ";
        }

        System.out.println("Convert all spaces, consecutive, one:\n" + str2);
    }
}
