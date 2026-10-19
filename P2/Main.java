// SINGLE INHERITANCE 
class Vehicle {
    String brand = "Toyota";

    public void startEngine() {
        System.out.println("The vehicle engine has started.");
    }
}

class Car extends Vehicle {
    String model = "Camry";

    public void displayCarDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Single Inheritance ===");
        Car myCar = new Car();
        myCar.startEngine();      
        myCar.displayCarDetails(); 
    }
}

// Multilevel inheritance
class Person {
    String name = "Anjali";

    public void showPerson() {
        System.out.println("Name: " + name);
    }
}


class Employee extends Person {
    int empId = 4052;

    public void showEmployee() {
        System.out.println("Employee ID: " + empId);
    }
}

class Manager extends Employee {
    String department = "Engineering";

    public void showManagerDetails() {
       
        showPerson();   
        showEmployee(); 
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("\n=== Multilevel Inheritance ===");
        Manager mgr = new Manager();
        mgr.showManagerDetails(); 
    }
}

// Hierarchical inheritance
class Shape {
    String color = "Red";

    public void displayColor() {
        System.out.println("Shape Color: " + color);
    }
}


class Circle extends Shape {
    double radius = 5.0;

    public void calculateAreaCircle() {
        double area = Math.PI * radius * radius;
        System.out.printf("Circle Area: %.2f\n", area);
    }
}


class Rectangle extends Shape {
    double length = 4.0;
    double width = 6.0;

    public void calculateAreaRectangle() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("\n=== Hierarchical Inheritance ===");
        
        Circle myCircle = new Circle();
        myCircle.displayColor(); 
        myCircle.calculateAreaCircle();

        System.out.println("--------------------");

        Rectangle myRect = new Rectangle();
        myRect.displayColor();  
        myRect.calculateAreaRectangle();
    }
}
