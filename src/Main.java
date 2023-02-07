import Coursework1.Employee;
import Coursework1.EmployeeBook;

public class Main {

    public static void main(String[] args) {
        System.out.println("Курсовая Часть 1");
//        Создадим сотрудников
        Employee alex1 = new Employee("Краснов В.И", 1, 14_000);
        Employee alex2 = new Employee("Чиров В.К", 1, 14_000);
        Employee alex3 = new Employee("Лудин Г.И", 2, 13_000);
        Employee alex4 = new Employee("Марчинина К.А", 3, 121_000);
        Employee alex5 = new Employee("Лошника Г.Б", 3, 333_020);
        Employee alex6 = new Employee("Матрешкина Х.В", 5, 13_500.2);
        Employee alex7  = new Employee("Черникова К.К", 4, 11_000);
        Employee alex8  = new Employee("Ерохин М.К", 2, 1_000);
        Employee alex9  = new Employee("Обломов Р.К", 5, 13_000);
        Employee alex10  = new Employee("Чекалова С.И", 4, 12_000);
//        Добавить сотрудников в Общею книгу сотрудников
        EmployeeBook employee = new EmployeeBook();
        employee.addEmployee(alex1);
        employee.addEmployee(alex2);
        employee.addEmployee(alex3);
        employee.addEmployee(alex4);
        employee.addEmployee(alex5);
        employee.addEmployee(alex6);
        employee.addEmployee(alex7);
        employee.addEmployee(alex8);
        employee.addEmployee(alex9);
        employee.addEmployee(alex10);
//        Печать всего списка
        employee.printAllEmployee();
        System.out.println();
//        Проверка гетов
        System.out.println("alex3.getSalary() = " + alex3.getSalary());
        System.out.println("alex4.getNameEmployee() = " + alex4.getNameEmployee());
        System.out.println("alex6.getDepartment() = " + alex6.getDepartment());
        System.out.println("alex1.getIdEmployee() = " + alex1.getIdEmployee());
//        Проверка сетов
        System.out.println();
        alex3.setSalary(100_231);
        System.out.println(alex3);
        alex1.setNameEmployee("Вилкин В.К");
        System.out.println(alex1);
        alex8.setDepartment(3);
        System.out.println();
//        Запрос на всю сумму затрат
        System.out.println("employee.allSalary(employee) = " + employee.allSalary(employee));
        System.out.println();
//        Запрос на среднею сумму затрат
        System.out.println("employee.midlSalary(employee) = " + employee.midlSalary(employee));
        System.out.println();
//        Поиск человека с минимальной зарплатой
        System.out.println("employee.searchMinSalary(employee) = " + employee.searchMinSalary(employee));
        System.out.println();
//        Поиск человека с максимальной зарплатой
        System.out.println("employee.searchMaxSalary(employee) = " + employee.searchMaxSalary(employee));
        System.out.println();
//        Вывод списка имен сотрудников
        employee.printNameEmployee(employee);
        System.out.println();
//        Индексация зарплат сотрудников
        employee.indexSalary(employee,10);
        employee.printAllEmployee();
//        Работа по отделам, найти сотрудников из нужного отдела
        System.out.println();
        employee.searchDepartmentEmployee(employee, 3);
        System.out.println();
//        Найти сотрудника из нужного отдела с наименьшей зарплатой
        System.out.println(employee.searchDepartmentEmployeeMin(employee, 3));
        System.out.println();
//        Найти сотрудника из нужного отдела с наибольшей зарплатой
        System.out.println(employee.searchDepartmentEmployeeMax(employee,3));
        System.out.println();
//        Общая зарплата на отдел
        System.out.println(employee.searchDepartmentSalary(employee, 3));
        System.out.println();
//        Средняя зарплата на отдел
        System.out.println(employee.searchDepartmentMidlSalary(employee, 3));
        System.out.println();
//        Индексация зарплаты у одного отдела
        employee.indexDepartmentEmployee(employee,3,10);
        employee.searchDepartmentEmployee(employee,3);
        System.out.println();
//        Печать имена всех сотрудников в департаменте
        employee.printAllDepartmentEmployee(employee,3);
        System.out.println();
//        Печать сотрудников у кого зарплата меньше суммы
        employee.printMinEmployeeSalary(employee, 10_000);
        System.out.println();
//        Печать сотрудников у кого зарплата больше суммы
        employee.printMaxEmployeeSalary(employee,10_000);
        System.out.println();
//        Проверка сетеров через методы
        employee.printAllEmployee();
//        Изменяем имя
        employee.setName(employee, "Краснов В.И", "Перевалов И.А.");
        System.out.println();
        employee.printAllEmployee();
        System.out.println();
//        Изменяем отдел
        employee.setDepartment(employee,"Ерохин М.К", 3);
        employee.printAllEmployee();
        System.out.println();
//        Изменяем зарплату
        employee.setSalary(employee, "Ерохин М.К", 100_234);
        employee.printAllEmployee();
        System.out.println();

        System.out.println("employee.searchMinSalary(employee) = " + employee.searchMinSalary(employee));
        System.out.println("employee.searchMaxSalary(employee) = " + employee.searchMaxSalary(employee));
        //        Работа по отделам, найти сотрудников из нужного отдела
        System.out.println();
        employee.searchDepartmentEmployee(employee, 3);
        System.out.println();
//        Найти сотрудника из нужного отдела с наименьшей зарплатой
        System.out.println(employee.searchDepartmentEmployeeMin(employee, 3));
        System.out.println();
//        Найти сотрудника из нужного отдела с наибольшей зарплатой
        System.out.println(employee.searchDepartmentEmployeeMax(employee,3));
        System.out.println();
    }
}