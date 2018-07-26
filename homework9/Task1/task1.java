package homework9.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 55.5;
        double b = -2.1;
        System.out.println(div(a, b));

        System.out.println("Enter in the console integer number (1 < num <  100):");
        try {
            int a1 = in.nextInt();
            readNumber(a1, 1, 100);
        }
        catch (InputMismatchException e){
            System.out.println("you did not enter a number");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void readNumber(int num, int start, int end) throws Exception{
        if (num <= start || num >= end){
            throw new Exception("the number does not lie in the interval [1; 100]");
        }
    }

    public static double div(double a, double b){
        double result;
        try {

            result = a/b;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            result = 0;
        }
        return result;
    }
}
