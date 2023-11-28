package Practical_Practice.Second_assignment;

import java.util.Scanner;

class Employee {
    int pan;
    String name;
    double taxincome;
    double tax;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Pan Number: ");
        pan = scanner.nextInt();
        System.out.println("Enter Name: ");
        name = scanner.next();
        System.out.println("Enter Tax-Income: ");
        taxincome = scanner.nextDouble();
        scanner.close();
    }

    void cal() {
        if (taxincome <= 250000) {
            tax = 0;
        } else if (taxincome <= 500000) {
            tax = 10000 + (0.2 * (taxincome - 250000));
        } else if (taxincome <= 1000000) {
            tax = 30000 + (0.3 * (taxincome - 500000));
        } else {
            tax = 50000 + (0.4 * (taxincome - 1000000));
        }
    }

    void display() {
        System.out.println("Pan Number Name Tax-Income Tax");
        System.out.println(pan + " " + name + " " + taxincome + " " + tax);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.input();
        employee.cal();
        employee.display();
    }
}
