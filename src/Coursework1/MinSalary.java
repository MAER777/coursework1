package Coursework1;

public class MinSalary {
    private String a;
    private String b;

    public void minSalary(Employee employee[]) {
        double min = 1500000;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
                this.a = employee[i].toString();

            }
            if (min == employee[i].getSalary()) {
                this.b = employee[i].toString();
                System.out.println(b);
            }
        }
        System.out.println(a);
        System.out.println(b);
    }

    public static void searchMinSalary1(Employee employee[]) {
        double minSalary = employee[0].getSalary();
        int id = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getIdEmployee();
            }
        }

    }
}
