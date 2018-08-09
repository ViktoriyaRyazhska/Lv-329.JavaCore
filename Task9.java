import java.util.Random;

public class Task9 {
    private static Integer variableMethod() {
        Integer variable;
        Random random = new Random();
        variable = random.nextInt(2);
        System.out.print(variable + " ");
        return variable;
    }

    public static void task9() {
        System.out.println("Please input the value of the variable:");
        Integer variable = Main.sc.nextInt();
        Integer variable0 = 0;
        for (Integer variableLoopCounter = 0; variableLoopCounter < variable; variableLoopCounter++) {
            if (variableMethod() == 1) {
                ++variable0;
            }
        }
        System.out.println("\n" + variable0);
    }
}