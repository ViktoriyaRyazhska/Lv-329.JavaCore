import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer variableLoopCounter;

        // Task No.1
        System.out.println("Please input the value of the number of the month:");
        Integer variable1 = scanner.nextInt();
        Integer variableArray1[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Amount of the days in this month equal: " + variableArray1[variable1] + ".");

        // Task No.2
        Integer variableArray2[] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        Integer variable21 = 0, variable22;
        for (variableLoopCounter = 0; variableLoopCounter < 5; variableLoopCounter++) {
            if (variableArray2[variableLoopCounter] < 0) {
                variable21++;
            }
        }
        if (variable21 > 0) {
            variable22 = 1;
            for (variableLoopCounter = 5; variableLoopCounter < variableArray2.length; variableLoopCounter++) {
                variable22 *= variableArray2[variableLoopCounter];
            }
        } else {
            variable22 = 0;
            for (variableLoopCounter = 0; variableLoopCounter < 5; variableLoopCounter++) {
                variable22 += variableArray2[variableLoopCounter];
            }
        }
        System.out.println(variable22);

        // Task No.3
        Integer variableArray31[] = new Integer[5], variableArray32[] = new Integer[5];
        System.out.println("Please input the values of the variables of the array:");
        for (variableLoopCounter = 0; variableLoopCounter < variableArray31.length; variableLoopCounter++) {
            variableArray31[variableLoopCounter] = scanner.nextInt();
        }
        Integer variable31 = 1, variable32 = 1, variable33 = variableArray31[0], variable34 = 0, variable35, variable36 = 0, variable37 = 1;
        variableLoopCounter = 0;
        while (variable31 == 1) {
            if (variableArray31[variableLoopCounter] < 0) {
                variableLoopCounter++;
            } else {
                if (variable32 == 1) {
                    variable32 = 0;
                    variableLoopCounter++;
                } else {
                    System.out.println("The value of the position of the second positive number equal: " + variableLoopCounter + ".");
                    variable31 = 0;
                }
            }
            if (variableLoopCounter == variableArray31.length) {
                System.out.println("This array is not contain two variables with positive values.");
                variable31 = 0;
            }
        }
        for (variableLoopCounter = 1; variableLoopCounter < variableArray31.length; variableLoopCounter++) {
            if (variableArray31[variableLoopCounter] < variable33) {
                variable33 = variableArray31[variableLoopCounter];
                variable34 = variableLoopCounter;
            }
        }
        System.out.println("The variable with the minimum value equal: " + variableArray31[variable34] + ", with the index: " + variable34 + ".");
        System.out.println("Please input the values of the variables of the array:");
        for (variableLoopCounter = 0; variableLoopCounter < variableArray32.length; variableLoopCounter++) {
            variable35 = scanner.nextInt();
            if (variable35 < 0) {
                variable36 = variableLoopCounter;
                break;
            }
            variableArray32[variableLoopCounter] = variable35;
        }
        for (variableLoopCounter = 0; variableLoopCounter < variable36; variableLoopCounter++) {
            if (variableArray32[variableLoopCounter] % 2 == 0) {
                variable37 *= variableArray32[variableLoopCounter];
            }
        }
        System.out.println("The value of the multiplication of the variables with even value equal: " + variable37 + ".");

        // Task No.4
        Car variableArray[] = new Car[4];
        variableArray[0] = new Car("Compact executive", 2018, 1.0);
        variableArray[1] = new Car("Executive / Mid-luxury", 2017, 1.0);
        variableArray[2] = new Car("Full-size luxury / Grand saloon", 2018, 1.0);
        variableArray[3] = new Car("Estate cars / Station wagons", 2017, 1.0);
        System.out.println("Please input the value of the year:");
        Integer variable41 = scanner.nextInt();
        for (variableLoopCounter = 0; variableLoopCounter < variableArray.length; variableLoopCounter++) {
            if ((variableArray[variableLoopCounter].getYearOfProduction()).equals(variable41)) {
                System.out.println(variableArray[variableLoopCounter]);
            }
        }
        Car variable42;
        Integer variableLoopCounter2;
        for (variableLoopCounter = 0; variableLoopCounter < variableArray.length; variableLoopCounter++) {
            for (variableLoopCounter2 = variableLoopCounter + 1; variableLoopCounter2 < variableArray.length; variableLoopCounter2++) {
                if (variableArray[variableLoopCounter].getYearOfProduction() < variableArray[variableLoopCounter2].getYearOfProduction()) {
                    variable42 = variableArray[variableLoopCounter];
                    variableArray[variableLoopCounter] = variableArray[variableLoopCounter2];
                    variableArray[variableLoopCounter2] = variable42;
                }
            }
        }
        for (variableLoopCounter = 0; variableLoopCounter < variableArray.length; variableLoopCounter++) {
            System.out.println(variableArray[variableLoopCounter]);
        }
    }
}