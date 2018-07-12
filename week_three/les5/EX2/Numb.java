package EX2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numb {
public static void main(String[] args) throws NumberFormatException, IOException {
	int []arr = new int[10];
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter 10 number: ");
	
	for (int i = 0; i < 10; i++) {
        arr[i] = Integer.parseInt(br.readLine());
	}
	int sumF = 0;	
	int calcN = 0; 
	
		for (int i = 0; i < 5; i++) {
		    if (arr[i]>0)
		    	calcN ++;
		}
		    if (calcN == 5){
		    	for (int i = 0; i < 5; i++)
		    		sumF += arr[i];
			}
		    else {
		    	for (int i = 5; i < 10; i++){
		    		sumF += arr[i];
		    	}
		    }
		System.out.println("If first 5 numb are the positive, it is sum they. Or not, it is a sum last five numbers: " + sumF);
}
}



