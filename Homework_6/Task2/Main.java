package Task2;

public class Main {
    public static void main(String args[]) {
        Employee[] e = {
                new SalariedEmployee("1", "Robert", "185697", 144, 12),
                new ContractEmployee("2", "Olga", "996574", 500),
                new SalariedEmployee("3", "Rich", "253697", 140, 10),
                new ContractEmployee("4", "Vlad", "584621", 600)
        };
        Employee tmp;
        for (int i = 0; i < e.length - 1; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (e[j].calculatePay() < e[i].calculatePay()) {
                    tmp = e[i];
                    e[i] = e[j];
                    e[j] = tmp;
                }
            }
        }
        for (Employee anE : e) {
            System.out.println(anE.toString());
        }
    }
}
