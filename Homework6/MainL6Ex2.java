package com.mak_keywa;

public class MainL6Ex2 {

	private static Employee[] company;
	private static Employee temp;

	public static void main(String[] args) {
		company = new Employee[5];
		company[0] = new ContractEmployee("Tax110", 10, 230);
		company[1] = new ContractEmployee("Tax120", 11, 240);
		company[2] = new ContractEmployee("Tax130", 9, 270);
		company[3] = new SalariedEmployee("Num111", 2500);
		company[4] = new SalariedEmployee("Num123", 3000);
		company[0].setEmployeeId("C10");
		company[1].setEmployeeId("C11");
		company[2].setEmployeeId("C12");
		company[3].setEmployeeId("C13");
		company[4].setEmployeeId("C14");
		temp = new Employee();
		for (int i = 0; i < company.length; i++) {
			for (int j = i + 1; j < company.length; j++) {
				if (company[i].calcPay() < company[j].calcPay()) {
					temp = company[i];
					company[i] = company[j];
					company[j] = temp;
				}
			}
		}
		for (int i = 0; i < company.length; i++) {
			System.out.println(company[i].toString());
		}

	}

}
