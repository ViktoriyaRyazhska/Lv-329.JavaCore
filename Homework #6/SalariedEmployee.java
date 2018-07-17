public class SalariedEmployee extends Employee implements Interface1 {
    private String socialSecurityNumber;
    private Double hourlyRate;
    private Integer numberOfHoursWorked;

    public SalariedEmployee() {}
    public SalariedEmployee(Double hourlyRate, Integer numberOfHoursWorked) {
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public void setNumberOfHoursWorked(Integer numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public Double getHourlyRate() {
        return hourlyRate;
    }
    public Integer getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    @Override
    public Double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }
    @Override
    public String toString() {
        return "An employee:\n■ Employee's ID: " + getEmployeeId() + ".\n■ " + this.getClass().getName() + ".\n■ Average monthly salary: " + calculatePay() + ".";
    }
}