package HW1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiveWords {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String text = br.readLine();
		 String words[] = text.split("[^a-zA-Z]");
	      int i, size = words.length;
	      int iMax = -1, iMaxLength = -1;
	      for (i = 0; i < size; ++i)
	         if (!"".equals(words[i]) && words[i].length() > iMaxLength) {
	            iMax = i;
	            iMaxLength = words[i].length();
	         }
	      if (iMax == -1) {
	         System.out.println("String does not contain words");
	      }
	      else {
	         System.out.println("\tword = " + words[iMax]);
	         System.out.println("The length of this word = " + iMaxLength);
	   }

	   
		String[] result = text.split("\\s");
		for (int x = 1; x < 2; x++) {
			String reverse = new StringBuffer(result[x]).reverse().toString();
			System.out.println(reverse);
			
			 
		}
			
			

}

}
