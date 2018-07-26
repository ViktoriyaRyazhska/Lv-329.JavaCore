package Task_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Leshko", "Oleg");
        personMap.put("Ivanov", "Ivan");
        personMap.put("Stetc", "Roman");
        personMap.put("Raven", "Ighor");
        personMap.put("Korol", "Stehan");
        personMap.put("Proste", "Lida");
        personMap.put("Zavinska", "Olga");
        personMap.put("Koval", "Oksana");
        personMap.put("Frolov", "Taras");
        personMap.put("Lenko", "Orest");
        String d = "";
        int k =0;

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if (entry.getValue().equals("Oleg")){
                d = entry.getKey();
            }
            for (Map.Entry<String, String> entry1 : personMap.entrySet()) {
               if (entry.getValue().equals(entry1.getValue())){
                   k++;
               }
            }
        }
        System.out.println((k>personMap.size()) ? "\nThere is at less 2 persom with the same first name."
                : "\nThere is no person with same first name.");
        personMap.remove(d);
        System.out.println();
        for (Map.Entry<String , String> entry : personMap.entrySet()) {
            System.out.println( entry.getKey() + " " + entry.getValue());
        }
    }
}
