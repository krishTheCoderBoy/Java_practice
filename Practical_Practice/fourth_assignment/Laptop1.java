package Practical_Practice.fourth_assignment;

import java.util.Scanner;

public class Laptop1 {
    private String name;
    private double price;
    private double dis;
    private double amt;

    Laptop1(String n, double p) {
        name = n;
        price = p;
        dis = 0;
        amt = 0;
    }

    void acceptDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the customer: ");
        name = in.nextLine();
        System.out.println("Enter the price of the laptop: ");
        price = in.nextDouble();
    }

    void computeDiscount() {
        if (price <= 25000) {
            dis = price * 0.05;
        } else if (price <= 50000) {
            dis = price * 0.075;
        } else if (price <= 100000) {
            dis = price * 0.1;
        } else {
            dis = price * 0.15;
        }
        amt = price - dis;
    }

    void display() {
        System.out.println("Customer Name: " + name);
        System.out.println("Discount: " + dis);
        System.out.println("Amount to be paid after discount: " + amt);
    }

    public static void main(String[] args) {
        Laptop1 laptop = new Laptop1("", 0);
        laptop.acceptDetails();
        laptop.computeDiscount();
        laptop.display();
    }
}
