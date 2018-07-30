import java.util.Scanner;

public class Homework9 {
    static Scanner scanner = new Scanner(System.in);

    private static Double div(Double variable1, Double variable2) {
        if (variable2 == 0) {
            throw new ArithmeticException("Please input the value of the second variable not equal zero!");
        }
        return variable1 / variable2;
    }

    private static Integer readNumber(Integer variable1, Integer variable2) throws NumberFormatException, Exception1, Exception2 {
        System.out.println("Please input the value of the variable:");
        Integer variable = Integer.parseInt(scanner.nextLine());
        if (variable1 < variable2) {
            if (!((variable >= variable1) && (variable <= variable2))) {
                throw new Exception1("Please input the different value of the variable!");
            }
            return variable;
        } else {
            throw new Exception2("Please input the values of the variables to satisfy the condition!");
        }
    }

    private static void main(Integer variable1, Integer variable2) throws NumberFormatException, Exception1, Exception2, Exception3 {
        Integer variable01 = readNumber(variable1, variable2);
        Integer variableLoopCounter, variable0 = 10;
        for (variableLoopCounter = 0; variableLoopCounter < variable0; variableLoopCounter++) {
            Integer variable02 = readNumber(variable1, variable2);
            if (variable01 < variable02) {
                readNumber(variable1, variable2);
                variable01 = variable02;
            } else {
                throw new Exception3("Please input the different values of the variables!");
            }
        }
    }

    public static void main(String[] args) {
        // Task No.1
        System.out.println("Please input the values of the two variables:");
        Double variable11 = scanner.nextDouble();
        Double variable12 = scanner.nextDouble();
        try {
            System.out.println(div(variable11, variable12));
        } catch (ArithmeticException variableException) {
            System.out.println(variableException.getMessage());
        }

        // Task No.2
        System.out.println("Please input the values of the two variables:");
        Integer variable21 = scanner.nextInt();
        Integer variable22 = scanner.nextInt();
        try {
            System.out.println(readNumber(variable21, variable22));
        } catch (NumberFormatException variableException1) {
            System.out.println(variableException1.getMessage());
        } catch (Exception2 variableException2) {
            System.out.println(variableException2.getMessage());
        } catch (Exception1 variableException3) {
            System.out.println(variableException3.getMessage());
        }
        try {
            main(variable21, variable22);
        } catch (NumberFormatException variableException1) {
            System.out.println(variableException1.getMessage());
        } catch (Exception2 variableException2) {
            System.out.println(variableException2.getMessage());
        } catch (Exception1 variableException3) {
            System.out.println(variableException3.getMessage());
        } catch (Exception3 variableException4) {
            System.out.println(variableException4.getMessage());
        }
    }
}