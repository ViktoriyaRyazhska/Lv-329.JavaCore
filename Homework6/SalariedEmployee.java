package com.mak_keywa;

public class SalariedEmployee extends Employee implements Pay {

	private String socialSecurityNumber;
	private int salary;
	
	

	public SalariedEmployee(String socialSecurityNumber, int salary) {
		this.socialSecurityNumber = socialSecurityNumber;
		this.salary = salary;
	}

	@Override
	public int calcPay() {
		return salary;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", salary=" + salary + "]";
	}
	
	

}
