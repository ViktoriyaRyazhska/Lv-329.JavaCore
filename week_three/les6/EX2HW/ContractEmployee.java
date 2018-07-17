package EX2HW;

public class ContractEmployee extends Employee implements calculatePay {

	private int fixedMonthly;
	private String name;
	
	public ContractEmployee(String employeeld, String name) {
		super(employeeld);
		this.name = name;
	}

	public ContractEmployee(String employeeld) {
		super(employeeld);
	}

	public int getFixedMonthly() {
		return fixedMonthly;
	}

	public void setFixedMonthly(int fixedMonthly) {
		this.fixedMonthly = fixedMonthly;
	}

	public ContractEmployee(String name, String employeeld, int fixedMonthly) {
		super(employeeld);
		this.fixedMonthly = fixedMonthly;
		this.name = name;
	}

	@Override
	public String getEmployeeld() {
		return super.getEmployeeld();
	}

	@Override
	public String toString() {
		return name + " is a ContractEmployee [fixedMonthly=" + fixedMonthly + "]with salary: " + fixedMonthly;
	}

	@Override
	public void setEmployeeld(String employeeld) {
		super.setEmployeeld(employeeld);
	}

	@Override
	public int calculatePay() {
		return fixedMonthly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
