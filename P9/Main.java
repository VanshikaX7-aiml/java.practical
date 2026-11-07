class Employee {
    String employeeName;
    double salary;

    static int employeeCount = 0;

    Employee() {
        this("Unknown", 0.0);
    }

    Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }

    void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("--");
    }

    static void displayCount() {
        System.out.println("Total Employees Created: " + employeeCount);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ayush", 50000);
        Employee e3 = new Employee("Rahul", 40000);

        e1.display();
        e2.display();
        e3.display();

        Employee.displayCount();
    }
}
