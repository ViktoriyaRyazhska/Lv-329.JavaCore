import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleRP {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a circle radius for calculating area: ");
		int radius = Integer.parseInt(br.readLine());
		double area = radius * Math.PI;
		System.out.println("A circle area: " + area);

		System.out.println("Enter a circle radius for calculating perimeter: ");
		int radius2 = Integer.parseInt(br.readLine());
		double perimeter = 2 * radius2 * Math.PI;
		System.out.println("A circle area: " + perimeter);

	}

}
