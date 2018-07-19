package com.mak_keywa;

import java.util.*;

public class MainL7Ex3 {

	public static void main(String[] args) {
		List<Student> Students = new ArrayList<Student>();
		Students.add(new Student("Name1", 1));
		Students.add(new Student("Name2", 2));
		Students.add(new Student("Name3", 3));
		Students.add(new Student("Name4", 2));
		Students.add(new Student("Name5", 2));
		Students.add(new Student("Name6", 3));
		Students.add(new Student("Name7", 1));
		Students.add(new Student("Name8", 1));
		Students.add(new Student("Name9", 2));
		Student temp = new Student();
		temp.printStudents(Students, 2);
		System.out.println();
		Students.sort(new NameComparator());
		for (Student st : Students) {
			System.out.println(st);
		}
		System.out.println();
		Students.sort(new NameComparator());
		Students.sort(new CourseComparator());
		for (Student st : Students) {
			System.out.println(st);
		}

	}

}
