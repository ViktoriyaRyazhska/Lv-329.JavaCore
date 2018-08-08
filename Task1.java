import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please input the value of the variable:");
        Scanner scanner = new Scanner(System.in);
        Integer variable = scanner.nextInt();
        Integer[] variableArray = new Integer[variable];
        variableArray[0] = variableArray[1] = 1;
        for (Integer variableLoopCounter = 2; variableLoopCounter < variable; variableLoopCounter++) {
            variableArray[variableLoopCounter] = variableArray[variableLoopCounter - 2] + variableArray[variableLoopCounter - 1];
        }
        for (Integer variableLoopCounter = 0; variableLoopCounter < variable; variableLoopCounter++) {
            System.out.print(variableArray[variableLoopCounter] + " ");
        }
    }
}