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
        employee [9] = new Employee( "Чекалова С.И", 4, 121_000);

//        Печать всего списка
        allPrintListEmployee(employee);

//        Проверка гетов
        System.out.println();
        System.out.println("employee[1].getIdEmployee() = " + employee[1].getNameEmployee());
        System.out.println("employee[2].getDepartment() = " + employee[2].getDepartment());
        System.out.println("employee[3].getSalary() = " + employee[3].getSalary());
        System.out.println("employee[4].getIdEmployee() = " + employee[4].getIdEmployee());
        System.out.println();

//        Проверка сетов
        employee[1].setNameEmployee("Курилова А.С");
        employee[8].setDepartment(1);
        employee[0].setSalary(100);
        System.out.println();

//        Запрос на всю сумму затрат.
        System.out.println("Общие затраты на зарплату в месяц: " + allSalary(employee));
        System.out.println();
//        Найти сотрудника с наименьшей зп
        System.out.println("Заработал мизер: " + searchMinSalary(employee));
        System.out.println();
//        Найти сотрудника с наивысшей зп
        System.out.println("Умка заработал больше всех: " + searchMaxSalary(employee));
        System.out.println();

    }

    public static void allPrintListEmployee (Employee[] employee) {
        for (Employee value : employee) {
            value.toString();
            System.out.println(value);
        }
    }
    public static double allSalary (Employee[] employee) {
        double allSum = 0;
        for (Employee value : employee) {
            allSum = allSum + value.getSalary();
//            System.out.println(sum); Распечатает каждое сложение сумм.
        }
        return allSum;
    }

    public static String searchMinSalary (Employee[] employee) {
        String minSalaryEmployee = employee[0].toString();
        double minSalary = employee[0].getSalary();
        for (Employee value : employee) {
            if (value.getSalary() < minSalary) {
                minSalary = value.getSalary();
                minSalaryEmployee = value.toString();
            }
        }
        return minSalaryEmployee;
    }

    public static String searchMaxSalary (Employee[] employee) {
        String maxSalaryEmployee = employee[0].toString();
        double maxSalary = employee[0].getSalary();
        for (Employee value : employee) {
            if (value.getSalary() > maxSalary) {
                maxSalary = value.getSalary();
                maxSalaryEmployee = value.toString();
            }
        }
        return maxSalaryEmployee;
    }
}