public class Homework6 {
    public static void main(String[] args) {
        Integer variableLoopCounter1, variableLoopCounter2;
/*
        // Task No.1
        Bird variable1[] = new Bird[4];
        variable1[0] = new Eagle();
        variable1[1] = new Swallow();
        variable1[2] = new Penguin();
        variable1[3] = new Chicken();
        for (variableLoopCounter1 = 0; variableLoopCounter1 < variable1.length; variableLoopCounter1++) {
            System.out.println(variable1[variableLoopCounter1] + "\n");
        }
*/
        // Task No.2
        Employee variable2[] = new Employee[4];
        variable2[0] = new SalariedEmployee(1.1, 1);
        variable2[1] = new SalariedEmployee(1.2, 1);
        variable2[2] = new ContractEmployee( 1.1);
        variable2[3] = new ContractEmployee(1.2);
        for (variableLoopCounter1 = 0; variableLoopCounter1 < variable2.length; variableLoopCounter1++) {
            variable2[variableLoopCounter1].setEmployeeId("000000" + variableLoopCounter1);
        }
        Employee variable21;
        for (variableLoopCounter1 = 0; variableLoopCounter1 < variable2.length - 1; variableLoopCounter1++) {
            for (variableLoopCounter2 = variableLoopCounter1; variableLoopCounter2 < variable2.length; variableLoopCounter2++) {
                if (((Interface1) variable2[variableLoopCounter1]).calculatePay() < ((Interface1) variable2[variableLoopCounter2]).calculatePay()) {
                    variable21 = variable2[variableLoopCounter1];
                    variable2[variableLoopCounter1] = variable2[variableLoopCounter2];
                    variable2[variableLoopCounter2] = variable21;
                }
            }
        }
        for (variableLoopCounter1 = 0; variableLoopCounter1 < variable2.length; variableLoopCounter1++) {
            System.out.println(variable2[variableLoopCounter1] + "\n");
        }
    }
}