package EX3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondPosAndMinNum {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int size = 5;
		int[] arr = new int[size];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 5 number: ");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int calcN = 0;

		for (int i = 0; i < size; i++) {
			if (arr[i] > 0)
				calcN++;

			if (calcN == 2) {

				System.out.println("Second positive num:" + (i + 1));
				break;
			} else {
				System.out.println("while there is no other positive number");
			}
		}
		int min = arr[0];
		int numPos = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] < min) {
				min = arr[i];
				numPos = i;

			}

		}
		System.out.println("A Minimum in array: " + min + " and his posihion:" + numPos);

	}
}
