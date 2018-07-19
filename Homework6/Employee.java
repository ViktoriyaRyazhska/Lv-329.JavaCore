package com.mak_keywa;

public class Employee implements Pay{
	private String employeeId;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public int calcPay() {
		return 0;
	}

}
