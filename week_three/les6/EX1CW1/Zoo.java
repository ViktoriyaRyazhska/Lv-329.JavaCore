package EX1CW;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Zoo {
	public static void main(String[] args) {
		int size = 4; 
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter number of Animals: ");
		//int size = Integer.parseInt(br.readLine());
		Animal[] A = new Animal[size];
		A [0] = new Cat("Barsik");
		A [1] = new Cat("Zina");
		A [2] = new Dog("Rex");
		A [3] = new Dog("Irma");
		A [0].feed();
		A [0].voice();
		A [1].feed();
		A [1].voice();
		A [2].feed();
		A [2].voice();
		A [3].feed();
		A [3].voice();
	}
}
