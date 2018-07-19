package HW7ex3;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student("Victor", 2));
		list.add(new Student("Zenya", 3));
		list.add(new Student("Vova", 4));
		list.add(new Student("Ira", 3));
		list.add(new Student("Vika", 3));
		list.add(new Student("Zhora", 3));
		list.add(new Student("Ben", 1));

		Collections.sort(list, new Name_comparator());
		list.sort(new Name_comparator());
		for (Student studName : list) {
			System.out.println(studName);

			Collections.sort(list, new Course_comparator());
			list.sort(new Course_comparator());
			for (Student course : list) {
				System.out.println(course);

				//Iterator it = list.iterator();

		
				}

			}
		}
	}

