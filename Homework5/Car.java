package com.mak_keywa;

public class Car {
	private String type;
	private int year;
	private double engine;

	public Car() {
	};

	public Car(String type, int year, double d) {
		this.type = type;
		this.year = year;
		this.engine = d;
	}

	public String getType() {
		return type;
	}

	public int getYear() {
		return year;
	}

	public double getEngine() {
		return engine;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car type is " + type + ", year = " + year + ", engine = " + engine + ".";
	}

}
