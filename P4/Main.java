class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    double calculatePay() {
        return 0;
    }
}


class FullTimeEmployee extends Employee {
    double calculatePay() {
        return 30000 + 5000; 
    }
}

// Derived class 2
class PartTimeEmployee extends Employee {
    double calculatePay() {
        return 500 * 40; 
    }
}

public class Main {
    public static void main(String[] args) {

    
        Calculator c = new Calculator();

        System.out.println("Addition of 2 integers: " + c.add(10, 20));
        System.out.println("Addition of 3 integers: " + c.add(10, 20, 30));
        System.out.println("Addition of 2 doubles: " + c.add(10.5, 20.5));

        System.out.println();

    
        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full-time employee pay: " + e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part-time employee pay: " + e.calculatePay());
    }
}
