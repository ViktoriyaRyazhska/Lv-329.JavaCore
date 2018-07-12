package EX3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductNum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array length: ");
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		int multp = 1;
		System.out.println("Enter number: ");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if( arr[i] % 2 == 0) {
				multp *=arr[i];
			}
			
			}
		if (multp == 1) {
			System.out.println("Zero even numbers");
		}
		System.out.println("multiply even numb: " + multp);
	}

}
