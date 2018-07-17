public class ContractEmployee extends Employee implements Interface1 {
    private String federalTaxIdMember;
    private Double fixedMonthlyPayment;

    public ContractEmployee() {}
    public ContractEmployee(Double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }
    public void setFixedMonthlyPayment(Double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }
    public Double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    @Override
    public Double calculatePay() {
        return fixedMonthlyPayment;
    }
    @Override
    public String toString() {
        return "An employee:\n■ Employee's ID: " + getEmployeeId() + ".\n■ " + this.getClass().getName() + ".\n■ Average monthly salary: " + calculatePay() + ".";
    }
}