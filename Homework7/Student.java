package com.mak_keywa;

import java.util.*;

public class Student {
	String name;
	int numberofcourse;

	public Student() {
	}

	public Student(String name, int numberofcourse) {
		this.name = name;
		this.numberofcourse = numberofcourse;
	}

	public String getName() {
		return name;
	}

	public int getNumberofcourse() {
		return numberofcourse;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberofcourse(int numberofcourse) {
		this.numberofcourse = numberofcourse;
	}

	public void printStudents(List<Student> students, int course) {
		for (Student student : students) {
			Student temp = (Student) student;
			if (temp.getNumberofcourse() == course) {
				System.out.println(temp);
			}
		}

	}

	@Override
	public String toString() {
		return "Student's name is " + name + " and numberofcourse is " + numberofcourse + ".";
	}

}
