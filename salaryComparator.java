package com.mak_keywa;

import java.util.Comparator;

public class salaryComparator implements Comparator<Stuff> {

	@Override
	public int compare(Stuff st1, Stuff st2) {
		try {
			return st1.calculateSalary() - st2.calculateSalary();
		} catch (SomeExeption e) {
			System.err.println("Error in sorting. Check if all info has been set.");
			return 0;
		}
	}
}