package EX1HW;

//import java.io.BufferedReader;

//import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		int size = 4;
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.out.println("Enter number of bird: ");
		// int size = Integer.parseInt(br.readLine());
		Bird[] B = new Bird[size];
		B[0] = new Eagle();
		B[1] = new Swallow();
		B[2] = new Penguin();
		B[3] = new Chicken();
		B[0].fly(); 
		B[0].layEggs();
		B[0].feathers();
		B[1].fly();
		B[1].layEggs();
		B[1].feathers();
		B[2].fly();
		B[2].layEggs();
		B[2].feathers();
		B[3].fly();
		B[3].layEggs();
		B[3].feathers();
		

	}

}
