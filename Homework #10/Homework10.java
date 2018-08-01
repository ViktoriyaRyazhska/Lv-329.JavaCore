import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        // Task No.1
        Runnable runnable11 = new VariableThread11();
        Thread thread11 = new Thread(runnable11);
        Runnable runnable12 = new VariableThread12();
        Thread thread12 = new Thread(runnable12);
        Runnable runnable13 = new VariableThread13();
        Thread thread13 = new Thread(runnable13);
        thread11.start();
        thread12.start();
        thread13.start();

        // Task No.2
        String variable21 = "a";
        String variable22 = "b";
        Thread thread = new Thread() {
            @Override
            public void run() {
                synchronized (variable21) {
                    System.out.println("!");
                    Thread.yield();
                    synchronized (variable22) {
                        System.out.println("!");
                    }
                }
            }
        };
        thread.start();
        synchronized (variable22) {
            System.out.println("!");
            synchronized (variable21) {
                System.out.println("!");
            }
        }

        // Task No.3
        Runnable runnable31 = new VariableThread31();
        Thread thread31 = new Thread(runnable31);
        thread31.start();

        // Task No.4
        FileReader fileReader;
        FileWriter fileWriter;
        Scanner scanner;

        String variableFile1 = "src/F #1.txt";
        String variableFile2 = "src/F #2.txt";
        List<String> variableList = new ArrayList<>();
        Integer variableLoopCounter, variable42 = 0, variable44 = 0;
        try {
            fileReader = new FileReader(variableFile1);
            scanner = new Scanner(fileReader);
            String variable41;
            while ((variable41 = scanner.nextLine()) != null) {
                variableList.add(variable41);
                ++variable42;
            }
            scanner.close();
        } catch (Exception variableException) {
            variableException.getStackTrace();
        }
        Integer variable43 = variableList.get(0).length();
        for (variableLoopCounter = 0; variableLoopCounter < variableList.size(); variableLoopCounter++) {
            if (variableList.get(variableLoopCounter).length() > variable43) {
                variable43 = variableList.get(variableLoopCounter).length();
                variable44 = variableLoopCounter;
            }
        }
        try {
            fileWriter = new FileWriter(variableFile2);
            fileWriter.write("The number of the rows in 'F #1.txt' equal: " + variable42 + ".\n");
            fileWriter.write("The longest row in 'F #1.txt' is:\n'" + variableList.get(variable44) + "'\n");
            fileWriter.write("First name & Last name: Taras Havryliv.\nBirthday date: 09/22/1998 (September 22, 1998).");
            fileWriter.close();
        } catch (Exception variableException) {
            variableException.getStackTrace();
        }
    }
}