package Practical_Practice.fifth_assignment;

import java.util.Scanner;

class Account {
    protected int acno;
    protected float balance;

    public Account(int a, int b) {
        acno = a;
        balance = b;
    }

    public void withdraw(int w) {
        balance -= w;
    }

    public void deposit(int d) {
        balance += d;
    }
}

class Calculate extends Account {
    private int r, t;
    private float si, amt;

    public Calculate(int a, int b, int x, int y) {
        super(a, b);
        r = x;
        t = y;
    }

    public void accept(int x, int y) {
        r = x;
        t = y;
        amt = 0;
    }

    public void compute() {
        si = (balance * r * t) / 100;
        amt = balance + si;
    }

    public void display() {
        System.out.println("\nAccount details:");
        System.out.println("Account number: " + acno);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + si);
        System.out.println("Amount: " + amt);
    }
}

public class Accout1 {
    public static void main(String[] args) {
        Calculate calculate = new Calculate(1001, 50000, 3, 2);
        calculate.accept(5, 3);
        calculate.compute();
        calculate.display();
    }
}
