package com.mak_keywa;

public class ContractEmployee extends Employee implements Pay {

	private String federalTaxIdmember;
	private int rate;
	private int hours;

	public ContractEmployee(String federalTaxIdmember, int rate, int hours) {
		this.federalTaxIdmember = federalTaxIdmember;
		this.rate = rate;
		this.hours = hours;
	}

	@Override
	public int calcPay() {
		return rate * hours;
	}

	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public int getRate() {
		return rate;
	}

	public int getHours() {
		return hours;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "ContractEmployee [federalTaxIdmember=" + federalTaxIdmember + ", rate=" + rate + ", hours=" + hours
				+ ", salary="+this.calcPay()+"]";
	}

}
