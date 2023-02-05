import Coursework1.Employee;

public class Main {

    public static void main(String[] args) {
        System.out.println("Курсовая Часть 1");

        Employee[] employee = new Employee[10];
        employee [0] = new Employee( "Краснов В.И", 1, 13_000);
        employee [1] = new Employee( "Чиров В.К", 1, 11_000);
        employee [2] = new Employee( "Лудин Г.И", 2, 13_000);
        employee [3] = new Employee( "Марчинина К.А", 3, 121_000);
        employee [4] = new Employee( "Лошника Г.Б", 3, 333_020);
        employee [5] = new Employee( "Матрешкина Х.В", 5, 13_500.2);
        employee [6] = new Employee( "Черникова К.К", 4, 11_000);
        employee [7] = new Employee( "Ерохин М.К", 2, 1_000);
        employee [8] = new Employee( "Обломов Р.К", 5, 13_000);
        employee [9] = new Employee( "Чекалова С.И", 4, 12_000);

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
        employee[0].setSalary(1000);
        System.out.println();

//        Запрос на всю сумму затрат.
        System.out.println("Общие затраты на зарплату в месяц: " + allSalary(employee));
        System.out.println();

//        Запрос на средние значением суммы зарплат
        System.out.println("Средняя сумма зарплаты в месяц: " + allSalary(employee) / employee.length);
//        Запрос через метод
        System.out.println("Средняя сумма зарплаты в месяц: " + midlSalary(employee));
        System.out.println();

//        Найти сотрудника с наименьшей зп
        System.out.println("Заработал мизер: " + searchMinSalary(employee));
        System.out.println("Заработал мизер: " + searchMinSalary1(employee));
        System.out.println();
//        Найти сотрудника с наивысшей зп
        System.out.println("Умка заработал больше всех: " + searchMaxSalary(employee));
        System.out.println();
//        Печать всех сотрудников
        printNameEmployee(employee);
        System.out.println();
        System.out.println("Вторая сложность");
//        Индексация зарплат
        indexSalary(employee, 2);
        allPrintListEmployee(employee);
        System.out.println();
//        Работа с отделами
        searchDepartment(employee, 2);
        System.out.println();
        System.out.println("В департаменте №2 наименьшую зп получил - " + searchDepartmentMinSalary(employee, 2));
        System.out.println();
        System.out.println("В департаменте №2 наибольшую зп получил - " + searchDepartmentMaxSalary(employee, 2));
        System.out.println();
        System.out.println("В департаменте №2 затраты на общую зп - " + searchDepartmentSalary(employee,2));
        System.out.println();
        System.out.println("В департаменте №2 затраты на общую зп - " + searchDepartmentMidlSalary(employee, 2));
        System.out.println();
//        Индексация зарплат по отделам
        indexDepartmentSalary(employee, 1, 10);
//        Печать всех сотрудников нужного отдела
        allPrintDepartmentFIO(employee, 3);
        System.out.println();
//        Печать сотрудников у кого зарплата меньше суммы
        less(employee, 10_000);
        System.out.println();
//        Печать сотрудников у кого зарплата больше суммы
        more(employee, 10_000);
        System.out.println();
        System.out.println("Третья сложность");

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

    public static double midlSalary (Employee[] employees) {
        return allSalary(employees) / employees.length;
    }

    public static Employee searchMinSalary (Employee[] employee) {
        Employee employeeMinSalary = null;
        double minSalary = 999_999_999;
        for (Employee value : employee) {
            if (value.getSalary() < minSalary) {
                minSalary = value.getSalary();
                employeeMinSalary = value;
            }
        }
        return employeeMinSalary;
    }

    public static Employee searchMinSalary1 (Employee[] employee) {
        Employee employeeMinSalary = employee[0];
        double minSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                employeeMinSalary = employee[i];
            }
        }
        return employeeMinSalary;
    }

    public static Employee searchMaxSalary (Employee[] employee) {
        Employee employeeMaxSalary = employee[0];
        double maxSalary = employee[0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                employeeMaxSalary = employee[i];
            }
        }
        return employeeMaxSalary;
    }

    public static String printNameEmployee (Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник: " + employees[i].getNameEmployee());
        }
        return null;
    }

    public static void indexSalary (Employee[] employees, int indexPercent) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() / 100 * indexPercent));
        }
    }

    public static void searchDepartment (Employee[] employee, int depNumber) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == depNumber) {
                System.out.println(employee[i].toString());
            }
        }
    }

    public static Employee searchDepartmentMinSalary (Employee[] employee, int depNumber) {
        double salary = 999_999_999;
        Employee employeeMinSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == depNumber) {
                if (employee[i].getSalary() < salary) {
                    salary = employee[i].getSalary();
                    employeeMinSalary = employee[i];
                }
            }
        }
        return employeeMinSalary;
    }

    public static Employee searchDepartmentMaxSalary (Employee[] employee, int depNumber) {
        double salary = 1;
        Employee employeeMaxSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == depNumber) {
                if (employee[i].getSalary() > salary) {
                    salary = employee[i].getSalary();
                    employeeMaxSalary = employee[i];
                }
            }
        }
        return employeeMaxSalary;
    }

    public static double searchDepartmentSalary (Employee[] employee, int depNumber) {
        double salary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == depNumber) {
                salary = salary + employee[i].getSalary();
            }
        }
        return salary;
    }

    public static double searchDepartmentMidlSalary (Employee[] employee, int depNumber) {
        int employeeDepAll = 0;
        double salary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == depNumber) {
                salary = salary + employee[i].getSalary();
                employeeDepAll++;
            }
        }
        salary = salary / employeeDepAll;
        return salary;
    }

    public static void indexDepartmentSalary (Employee[] employee, int depNumber, int indexPercent) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == depNumber) {
                employee[i].setSalary(employee[i].getSalary() + (employee[i].getSalary() / 100 * indexPercent));
            }
        }
    }
    public static void allPrintDepartmentFIO (Employee[] employee, int depNumber) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDepartment() == depNumber) {
                System.out.println(employee[i].getIdEmployee() + ". " + employee[i].getNameEmployee() + " Зарплата: " + employee[i].getSalary());
            }
        }
    }

    public static void less (Employee[] employees, int sum) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < sum) {
                System.out.println(employees[i].toString());
            }
        }
    }

    public static void more (Employee[] employees, int sum) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() >= sum) {
                System.out.println(employees[i].toString());
            }
        }
    }
}