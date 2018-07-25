import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer variableLoopCounter;

        // Task No.1
        String variable1[] = new String[5];
        System.out.println("Please input the sentence of the five words:");
        for (variableLoopCounter = 0; variableLoopCounter < variable1.length; variableLoopCounter++) {
            variable1[variableLoopCounter] = scanner.next();
        }
        Integer variable11 = 0;
        Integer variable12 = variable1[variable11].length();
        for (variableLoopCounter = 1; variableLoopCounter < variable1.length; variableLoopCounter++) {
            if (variable1[variableLoopCounter].length() > variable12) {
                variable11 = variableLoopCounter;
                variable12 = variable1[variableLoopCounter].length();
            }
        }
        System.out.println("The longest word in the sentence is: " + variable1[variable11] + ".");
        System.out.println("The number of the letters in this word equal: " + variable12 + ".");
        String variable13 = new StringBuffer(variable1[1]).reverse().toString();
        System.out.println("The second word in reverse order is: " + variable13 + ".");

        // Task No.2
        System.out.println("Please input the sentence:");
        String variable2 = scanner.nextLine();
        variable2 = variable2.replaceAll("[ ]+", " ");
        System.out.println("The sentence:");
        System.out.println(variable2);

        // Task No.3
        System.out.println("Please input the sentence:");
        String variable3 = scanner.nextLine();
        String variablePattern = "\\$(\\d*)+\\.\\d\\d";
        Pattern pattern = Pattern.compile(variablePattern);
        Matcher matcher = pattern.matcher(variable3);
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.out.println("Please input the different sentence!");
        }
    }
}