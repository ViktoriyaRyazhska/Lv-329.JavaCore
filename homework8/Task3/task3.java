package homework8.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter in the console sentence:");
        String str = in.nextLine();
        Pattern pattern = Pattern.compile("\\$(\\d*)+\\.\\d\\d");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}
