package com.mak_keywa;

import java.util.Calendar;

public class Person {

	private String name;
	private int birthYear;

	public static void main(String[] args) {
	}

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int age() {
		int yearnow = Calendar.YEAR;
		return yearnow - this.birthYear;
	}

	public void input(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String output() {
		return "Person " + name + " is " + age() + " years old";
	}
	
	public void changeName(String name) {
		this.name = name;
	}

}
