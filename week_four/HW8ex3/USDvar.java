package HW8ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class USDvar {

				public static void main(String[] args) throws IOException {
				Pattern p = Pattern.compile("\\d*\\.\\d{2}");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("$");
				String numb = br.readLine();
				Matcher m = p.matcher(numb);
				if (m.matches()) {
					System.out.println("$" + numb);
				}
				else {
					System.out.println("Error, please enter again");
				}
			}
		

	}

