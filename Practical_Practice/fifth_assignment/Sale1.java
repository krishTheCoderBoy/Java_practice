package Practical_Practice.fifth_assignment;

import java.util.Scanner;

class Sale {
    private String title, author, publication;
    public double price;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book details:");
        System.out.print("Title: ");
        title = scanner.nextLine();
        System.out.print("Author: ");
        author = scanner.nextLine();
        System.out.print("Publication: ");
        publication = scanner.nextLine();
        System.out.print("Price: ");
        price = scanner.nextDouble();
    }

    public void display() {
        System.out.println("\nBook details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication: " + publication);
        System.out.println("Price: " + price);
    }
}

class Purchase extends Sale {
    private int noc;
    private int amount;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of copies: ");
        noc = scanner.nextInt();
    }

    public void calculate() {
        amount = noc * (int) price;
    }

    public void show() {
        display();
        System.out.println("Number of copies: " + noc);
        System.out.println("Amount to be paid: " + amount);
    }
}

public class Sale1 {
    public static void main(String[] args) {
        Purchase purchase = new Purchase();
        purchase.input();
        purchase.accept();
        purchase.calculate();
        purchase.show();
    }
}