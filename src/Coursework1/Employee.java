package Coursework1;

public class Employee {
    private String nameEmployee;

    private int department;

    private double salary;
    private static int duration;
    private int id;


    public Employee (String nameEmployee, int department, double salary) {
        this.nameEmployee = nameEmployee;
        this.department = department;
        this.salary = salary;
        id = duration++ + 1;
    }

    public String getNameEmployee() {
        return this.nameEmployee;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getIdEmployee() {
        return id;
    }
    public String toString() {
        return id + ". " + this.nameEmployee + ". Отдел: " + this.department + ".  Зарплата: " + this.salary;
    }

    public static void allSalary () {
    }
}
