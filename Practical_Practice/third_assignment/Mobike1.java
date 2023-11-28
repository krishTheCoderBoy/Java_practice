package Practical_Practice.third_assignment;

import java.util.Scanner;

class Mobike {
    private int bno;
    private int phno;
    private String name;
    private int days;
    private int charge;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Bike number: ");
        bno = in.nextInt();
        System.out.println("Enter the Customer's phone number: ");
        phno = in.nextInt();
        System.out.println("Enter the Customer's name: ");
        name = in.next();
        System.out.println("Enter the number of days the bike is taken on rent: ");
        days = in.nextInt();
    }

    void compute() {
        if (days <= 5)
            charge = 500 * days;
        else if (days <= 10)
            charge = 500 * 5 + 400 * (days - 5);
        else
            charge = 500 * 5 + 400 * 5 + 200 * (days - 10);
    }

    void display() {
        System.out.println("Bike No. " + bno);
        System.out.println("Phone No. " + phno);
        System.out.println("Name " + name);
        System.out.println("No. of days " + days);
        System.out.println("Charge. " + charge);
    }
}

public class Mobike1 {
    public static void main(String[] args) {
        Mobike mobike = new Mobike();
        mobike.input();
        mobike.compute();
        mobike.display();
    }
}
