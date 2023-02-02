package Coursework1;

public class AllSalary {
    public double allSalary (Employee employee[]) {
        double sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
//            System.out.println(sum); Распечатает каждое сложение сумм.
        }
        System.out.println("Общие затраты на зарплату в месяц: " + sum);
        return 0;
    }
}
