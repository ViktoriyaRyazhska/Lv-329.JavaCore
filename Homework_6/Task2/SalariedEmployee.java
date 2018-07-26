package Task2;

public class SalariedEmployee extends Employee implements PayInterface {
    private final String name;
    private String socialSecurityNumber;
    private final int numberOfHoursWorked;
    private final int hourlyRate;

    SalariedEmployee(String employeeId, String name, String socialSecurityNumber, int numberOfHoursWorked, int hourlyRate) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.hourlyRate = hourlyRate;
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public int calculatePay() {
        return numberOfHoursWorked * hourlyRate;
    }

    @Override
    public String toString() {
        return "Id №:" + employeeId + ". " + name + " have " + calculatePay() + " average monthly wage.";
    }
}
