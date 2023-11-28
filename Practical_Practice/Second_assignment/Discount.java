package Practical_Practice.Second_assignment;

import java.util.Scanner;

class Discount {
    int cost;
    String name;
    double dc;
    double amt;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cost of the article: ");
        cost = scanner.nextInt();
        System.out.println("Enter Name of the customer: ");
        name = scanner.next();
        scanner.close();
    }

    void cal() {
        if (cost <= 5000) {
            dc = 0;
        } else if (cost <= 10000) {
            dc = 0.1 * cost;
        } else if (cost <= 15000) {
            dc = 0.15 * cost;
        } else {
            dc = 0.2 * cost;
        }
        amt = cost - dc;
    }

    void display() {
        System.out.println("Name of the customer Discount Amount to be paid");
        System.out.println(".................... ........ .................");
        System.out.println(name + " " + dc + " " + amt);
    }

    public static void main(String[] args) {
        Discount discount = new Discount();
        discount.input();
        discount.cal();
        discount.display();
    }
}
