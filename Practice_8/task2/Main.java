package task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args []) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 5 names : ");
        String [] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            names[i] = s.next();
        }
        Pattern p = Pattern.compile("^[A-Za-z0-9_]{3,15}");
        for (String name : names) {
            Matcher m = p.matcher(name);
            System.out.println((m.matches())? name + " pass."
                    : name + " not pass.");
        }
    }
}
