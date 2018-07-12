package EX3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlyPositiveNumb {
public static void main(String[] args) throws NumberFormatException, IOException {
	

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter array length: ");
	int size = Integer.parseInt(br.readLine());
	int[] arr = new int[size];
	System.out.println("Enter number: ");
	for (int i = 0; i < size; i++) {
		arr[i] = Integer.parseInt(br.readLine());
		if (arr[i]>0) {
			System.out.println("Enter next number: ");
			}
		else {
			break;
		}
	
		
	}
	
	}
}

