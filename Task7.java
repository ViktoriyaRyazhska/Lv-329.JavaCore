import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Please input the value of the variable:");
        Scanner scanner = new Scanner(System.in);
        Integer variable = scanner.nextInt();
        Integer variable0 = 1;
        for (Integer variableLoopCounter = 2; variableLoopCounter <= variable; variableLoopCounter++) {
            variable0 *= variableLoopCounter;
        }
        System.out.println(variable0);
    }
}