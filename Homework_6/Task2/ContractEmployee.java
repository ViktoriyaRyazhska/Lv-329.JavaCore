package Task2;

public class ContractEmployee extends Employee implements PayInterface {
    private final String name;
    private String federalTaxIdmember;
    private int fixedMonthlyPayment;

    ContractEmployee(String employeeId, String name, String federalTaxIdmember, int  fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.employeeId = employeeId;
         this.name = name;
         this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public int calculatePay() {
        return fixedMonthlyPayment;
    }
    @Override
    public String toString() {
        return "Id №:" + employeeId + ". " + name + " have " + calculatePay() + " average monthly wage.";
    }
}