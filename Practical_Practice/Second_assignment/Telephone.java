package Practical_Practice.Second_assignment;

import java.util.Scanner;

class Telephone {
    int number;
    String name;
    int amt;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        number = scanner.nextInt();
        System.out.println("Enter Name: ");
        name = scanner.next();
        scanner.close();
    }

    void cal() {
        if (number % 10 == 0) {
            amt = 200;
        } else {
            amt = 300;
        }
    }

    void display() {
        System.out.println("Name of the customer Phone Number Amount to be paid");
        System.out.println(".................... ........ .................");
        System.out.println(name + " " + number + " " + amt);
    }

    public static void main(String[] args) {
        Telephone telephone = new Telephone();
        telephone.input();
        telephone.cal();
        telephone.display();
    }
}
