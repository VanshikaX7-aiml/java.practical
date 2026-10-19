import java.util.Scanner;


class Student {
    int rollNo;
    String name;
    double marks1, marks2, marks3;
  
    public Student(int rollNo, String name, double marks1, double marks2, double marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public double calculateTotal() {
        return marks1 + marks2 + marks3;
    }


    public double calculatePercentage() {
        return (calculateTotal() / 300) * 100;
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
        System.out.println("Marks  : [" + marks1 + ", " + marks2 + ", " + marks3 + "]");
        System.out.println("Total  : " + calculateTotal());
        System.out.printf("Percent: %.2f%%\n", calculatePercentage());
        System.out.println("+-----");
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("--- Student Details ---\n");

        Student student1 = new Student(101, "Aarav Sharma", 85.5, 90.0, 78.0);
        Student student2 = new Student(102, "Isha Patel", 92.0, 88.5, 95.0);
        Student student3 = new Student(103, "Rohan Das", 74.0, 65.0, 80.5);
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
