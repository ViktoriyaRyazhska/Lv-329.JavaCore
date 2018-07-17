package EX2HW;

public class App {

	public static void main(String[] args) {
		int size = 4;
		Employee[] employee = new Employee[size];

		employee[0] = new SalariedEmployee("Arya","1", "1133323", 600, 144);
		employee[1] = new ContractEmployee("Nazar","2", 25000);
		employee[2] = new SalariedEmployee("Victoria","3", "3131316", 550, 166);
		employee[3] = new ContractEmployee("Ben","4", 30000);

		Employee rate = null;
		for (int i = 0; i < size; i++) {
			for (int a = i + 1; a < size; a++) {
				if (((calculatePay) employee[i]).calculatePay() < ((calculatePay) employee[a]).calculatePay()) {
					rate = employee[i];
					employee[i] = employee[a];
					employee[a] = rate;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(employee[i]);
		}
	}

}
