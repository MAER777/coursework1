import Coursework1.Employee;

public class Main {

    public static void main(String[] args) {
        System.out.println("Курсовая Часть 1");

        Employee[] employee = new Employee[10];
        employee [0] = new Employee( "Краснов В.И", 1, 121_000);
        employee [1] = new Employee( "Чиров В.К", 1, 3_000);
        employee [2] = new Employee( "Лудин Г.И", 2, 13_000);
        employee [3] = new Employee( "Марчинина К.А", 3, 121_000);
        employee [4] = new Employee( "Лошника Г.Б", 3, 333_020);
        employee [5] = new Employee( "Матрешкина Х.В", 5, 133_500.2);
        employee [6] = new Employee( "Черникова К.К", 4, 1111_000);
        employee [7] = new Employee( "Ерохин М.К", 2, 1333_000);
        employee [8] = new Employee( "Обломов Р.К", 5, 12_000);
        employee [9] = new Employee( "Чекалова С.И", 4, 11_000);

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
        System.out.println();
        System.out.println("employee[1].getIdEmployee() = " + employee[1].getNameEmployee());
        System.out.println("employee[2].getDepartment() = " + employee[2].getDepartment());
        System.out.println("employee[3].getSalary() = " + employee[3].getSalary());
        System.out.println("employee[4].getIdEmployee() = " + employee[4].getIdEmployee());
        System.out.println();

//        Запрос на всю сумму затрат.
        System.out.println("Общие затраты на зарплату в месяц: " + allSalary(employee));

//        Найти сотрудника с наименьшей зп
        System.out.println("Черт: " + searchMinSalary(employee));
    }

    public static double allSalary (Employee employee[]) {
        double allSum = 0;
        for (int i = 0; i < employee.length; i++) {
            allSum = allSum + employee[i].getSalary();
//            System.out.println(sum); Распечатает каждое сложение сумм.
        }
        return allSum;
    }

    public static String searchMinSalary (Employee[] employee) {
        String minSalaryEmployee = employee[0].toString();
        double minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                minSalaryEmployee = employee[i].toString();
            }
        }
        return minSalaryEmployee;
    }
}