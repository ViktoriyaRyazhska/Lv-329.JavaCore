package HW7ex2;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class personMap {
	public static void main(String[] argv) throws Exception {

		Map<String, String> map = new LinkedHashMap<String, String>();

		map.put("Viktoria", "Kokuienko");
		map.put("Nazar", "Ptashynskyi");
		map.put("Orest", "Petrenko");
		map.put("Roman", "Ivankiv");
		map.put("Volodymyr", "Lebedyn");
		map.put("Orest", "Kalinovskyi");
		map.put("Borys", "Denigin");
		map.put("Maria", "Thsymbaluk");
		map.put("Ivan", "Rasulov");
		map.put("Ulian", "Tustanovskyi");

		int count = 0;
		for (Map.Entry<String, String> string1 : map.entrySet()) {
			for (Map.Entry<String, String> string2 : map.entrySet())
				if (string1.getKey().equals(string2.getKey()))
					;
			count++;

		}
		if (count >= 1) {
			System.out.println("We have two identical names or more identical names");
		}
		if (count == 0) {
			System.out.println("We do not have the same names");
		}
		 
		Collection <String> list = map.values();
		    for(Iterator<String> itr = list.iterator(); itr.hasNext();)
		    {
		        if(Collections.frequency(list, itr.next())>1)
		        {
		            itr.remove();
		        }
		    
		    }
		    System.out.println(map);
	}
	
}
