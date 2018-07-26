package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter surname, name and patronumic : ");
        String text = br.readLine();
        String[] arr = text.split(" ");
        System.out.println(arr[0] + " " + arr[1].charAt(0) + "." + arr[2].charAt(0) + ".");
        System.out.println(arr[1]);
        System.out.println(arr[1] + " " + arr[2] + " " + arr[0]);
    }
}
