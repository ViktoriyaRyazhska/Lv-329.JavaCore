import java.util.Random;
import java.util.Scanner;

public class Task9 {
    private static Integer variableMethod() {
        Integer variable;
        Random random = new Random();
        variable = random.nextInt(2);
        System.out.print(variable + " ");
        return variable;
    }

    public static void main(String[] args) {
        System.out.println("Please input the value of the variable:");
        Scanner scanner = new Scanner(System.in);
        Integer variable = scanner.nextInt();
        Integer variable0 = 0;
        for (Integer variableLoopCounter = 0; variableLoopCounter < variable; variableLoopCounter++) {
            if (variableMethod() == 1) {
                ++variable0;
            }
        }
        System.out.println("\n" + variable0);
    }
}