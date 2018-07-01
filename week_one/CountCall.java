import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountCall {

		public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("How much does a minute call cost in the USA?");
		double pcUsa = Double.parseDouble(br.readLine());
		System.out.println("How many time have u talked? (Enter dollars.cents. For ex.: 2.30)");
		double mtUsa = Double.parseDouble(br.readLine());
		System.out.println("Your phone call are costs: " + pcUsa * mtUsa );
		System.out.println("How much does a minute call cost in the Poland? (Enter Zl.cents. For ex.: 2.30)");
		double pcPL = Double.parseDouble(br.readLine());
		System.out.println("How many time have u talked? (Enter Minutes.Seconds. For ex.: 5.36)");
		double mtPL = Double.parseDouble(br.readLine());
		System.out.println("Your phone call are costs: " + pcPL * mtPL );
		System.out.println("How much does a minute call cost in the Ukraine? (Enter Gryvna.copeks. For ex.: 2.30)");
		double pcUA = Double.parseDouble(br.readLine());
		System.out.println("How many time have u talked? (Enter Minutes.Seconds. For ex.: 5.36)");
		double mtUA = Double.parseDouble(br.readLine());
		System.out.println("Your phone call are costs: " + pcUA * mtUA );
	}

}
