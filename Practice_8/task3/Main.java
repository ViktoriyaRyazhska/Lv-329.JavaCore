package task3;

import java.util.Scanner;

public class Main {
    public static void main(String args []) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 variables (String)");
        String s1 = s.next();
        String s2 = s.next();
        System.out.println((s1.contains(s2)) ? "First variable substring second(true)"
                : "First variable do not substring second(false)");
    }
}
