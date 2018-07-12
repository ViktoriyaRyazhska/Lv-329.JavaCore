package EX1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
public static void main(String[] args) throws NumberFormatException, IOException {
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter month number: ");
int NumM = Integer.parseInt(br.readLine());
NumM +=1;
int [] monthArr = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
System.out.println("The number of days in a mounth: " + (monthArr[NumM]));
}

}
