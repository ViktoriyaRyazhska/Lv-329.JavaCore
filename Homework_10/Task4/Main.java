package Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String args[]) {
        FileReader fr;
        BufferedReader br;
        FileWriter fw;
        BufferedWriter bw;
        String file1 = "D:\\file1.txt";
        String file2 = "D:\\file2.txt";
        String str;
        String nameLine = "";
        String birthLine = "";
        List<String> list = new ArrayList<>();

        try {
            fr = new FileReader(file1);
            br = new BufferedReader(fr);
            while ((str = br.readLine()) != null) {
                list.add(str);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line1 = "file1.txt have " + list.size() + " lines";
        int maxLength = 0;
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();
                k = i;
            }
            if (list.get(i).toLowerCase().contains("name")) {
                nameLine = list.get(i);
            }
            if (list.get(i).toLowerCase().contains("birth")) {
                birthLine = list.get(i);
            }
        }
        Pattern pattern = Pattern.compile("[A-Z][a-z]{2,9}");
        Matcher matcher = pattern.matcher(nameLine);
        Pattern pattern1 = Pattern.compile("[0-9.]{10}");
        Matcher matcher1 = pattern1.matcher(birthLine);

        try {
            fw = new FileWriter(file2);
            bw = new BufferedWriter(fw);
            bw.write(line1);
            bw.write("\nMax line is '" + list.get(k) + "'");
            while (matcher.find()) {
                bw.write("\nName - " + nameLine.substring(matcher.start(), matcher.end()));
            }
            while (matcher1.find()) {
                bw.write("\nBirth date - " + birthLine.substring(matcher1.start(), matcher1.end()));
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
