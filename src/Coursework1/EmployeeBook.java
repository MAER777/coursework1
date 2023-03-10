package Coursework1;

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[11];
    }

    public void addEmployee(Employee employee) {
        if (size >= employees.length) {
            System.out.println("Закончилось место в писке...");
        }
        Employee newEmployee = new Employee(employee.getNameEmployee(), employee.getDepartment(), employee.getSalary());
        employees[size++] = newEmployee;
    }

    public void printAllEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public void removeEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getNameEmployee().equals(employee.getNameEmployee())) {
                System.out.println("Сотрудник ~~ " + employee.getNameEmployee() + " удален!");
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public double allSalary(EmployeeBook employee) {
        double allSum = 0;
        for (int i = 0; i < size; i++) {
            allSum = employees[i].getSalary() + allSum;
        }
        return allSum;
    }

    public double midlSalary(EmployeeBook employee) {
        return allSalary(employee) / employees.length;
    }

    public Employee searchMinSalary(EmployeeBook employee) {
        Employee employeeSalary = employees[0];
        double min = employees[0].getSalary();
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                employeeSalary = employees[i];
            }
        }
        return employeeSalary;
    }

    public Employee searchMaxSalary(EmployeeBook employee) {
        Employee employeeSalary = employees[0];
        double min = employees[0].getSalary();
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > min) {
                min = employees[i].getSalary();
                employeeSalary = employees[i];
            }
        }
        return employeeSalary;
    }

    public String printNameEmployee(EmployeeBook employee) {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getNameEmployee());
        }
        return null;
    }

    public double indexSalary(EmployeeBook employee, int indexSalary) {
        for (int i = 0; i < size; i++) {
            employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() / 100 * indexSalary));
        }
        return 0;
    }

    public String searchDepartmentEmployee(EmployeeBook employee, int department) {
        for (int i = 0; i < size; i++) {
            if (department == employees[i].getDepartment())
                System.out.println(employees[i].toString());
        }
        return null;
    }

    public Employee searchDepartmentEmployeeMin(EmployeeBook employee, int department) {
        double min = 999_999_999;
        Employee employee1 = employees[0];
        for (int i = 0; i < size; i++) {
            if (department == employees[i].getDepartment())
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    employee1 = employees[i];
                }
        }
        return employee1;
    }

    public Employee searchDepartmentEmployeeMax(EmployeeBook employee, int department) {
        double max = 1;
        Employee employee1 = employees[0];
        for (int i = 0; i < size; i++) {
            if (department == employees[i].getDepartment())
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    employee1 = employees[i];
                }
        }
        return employee1;
    }

    public double searchDepartmentSalary(EmployeeBook employee, int department) {
        double salary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                salary = salary + employees[i].getSalary();
            }
        }
        return salary;
    }

    public double searchDepartmentMidlSalary(EmployeeBook employee, int department) {
        int employeeDepNum = 0;
        double salary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                salary = salary + employees[i].getSalary();
                employeeDepNum++;
            }
        }
        salary = salary / employeeDepNum;
        return salary;
    }

    public void indexDepartmentEmployee(EmployeeBook employee, int department, int indexSalary) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary(employees[i].getSalary() + (employees[i].getSalary() / 100 * indexSalary));
            }
        }
    }

    public void printAllDepartmentEmployee(EmployeeBook employee, int department) {
        for (int i = 0; i < size; i++)
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getNameEmployee());
            }
    }

    public Employee printMinEmployeeSalary(EmployeeBook employee, double salary) {
        for (int i = 0; i < size; i++)
            if (employees[i].getSalary() < salary) {
                System.out.println(employees[i].toString());
            }
        return null;
    }

    public Employee printMaxEmployeeSalary(EmployeeBook employee, double salary) {
        for (int i = 0; i < size; i++)
            if (employees[i].getSalary() > salary) {
                System.out.println(employees[i].toString());
            }
        return null;
    }
    public void setName (EmployeeBook employee, String lastName, String setName) {
        for (int i = 0; i < size; i++) {
            if (lastName.equals(employees[i].getNameEmployee())) {
                employees[i].setNameEmployee(setName);
            }
        }
    }

    public void setDepartment (EmployeeBook employee, String emplName , int setDep) {
        for (int i = 0; i < size; i++) {
            if (emplName.equals(employees[i].getNameEmployee())) {
                employees[i].setDepartment(setDep);
            }
        }
    }

    public void setSalary (EmployeeBook employee, String emplName , double setSalary) {
        for (int i = 0; i < size; i++) {
            if (emplName.equals(employees[i].getNameEmployee())) {
                employees[i].setSalary(setSalary);
            }
        }
    }
}
