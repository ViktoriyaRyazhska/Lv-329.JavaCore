package EX2HW;

public class SalariedEmployee extends Employee implements calculatePay {

	public SalariedEmployee(String employeeld) {
		super(employeeld);

	}

	@Override
	public String getEmployeeld() {
		// TODO Auto-generated method stub
		return super.getEmployeeld();
	}

	@Override
	public void setEmployeeld(String employeeld) {
		// TODO Auto-generated method stub
		super.setEmployeeld(employeeld);
	}

	@Override
	public String toString() {
		return name + " is a SalariedEmployee [socialSecurityNumber=" + socialSecurityNumber + ", hourlyRate=" + hourlyRate
				+ ", numberHours=" + numberHours + "] with salary: " + calculatePay();
	}

	private String socialSecurityNumber;
	private int hourlyRate;
	private int numberHours;
	private String name;


	public SalariedEmployee(String name, String employeeld, String socialSecurityNumber, int hourlyRate, int numberHours) {
		super(employeeld);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.numberHours = numberHours;
		this.name = name;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberHours() {
		return numberHours;
	}

	public void setNumberHours(int numberHours) {
		this.numberHours = numberHours;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public SalariedEmployee(String employeeld, String socialSecurityNumber) {
		super(employeeld);
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public int calculatePay() {

		return hourlyRate * numberHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
