package com.mak_keywa;

import java.io.IOException;
import java.util.Scanner;

public abstract class Stuff {
	private String name;
	private int salary;
	private int hours;

	public Stuff() {
	}

	public Stuff(String name) {
		this.name = name;
	}

	public Stuff(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}

	public abstract int calculateSalary() throws SomeExeption;

	public abstract void input(Scanner sc);

	public abstract void input(String file) throws IOException;

	public abstract void print();

	public abstract void print(String file) throws IOException;

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getHours() {
		return hours;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
