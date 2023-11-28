package Practical_Practice.third_assignment;

import java.util.Scanner;

class Loan {
    int time;
    double principal;
    double rate;
    double interest;
    double amt;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount, time and rate of interest");
        principal = sc.nextDouble();
        time = sc.nextInt();
        rate = sc.nextDouble();
    }

    void calculate() {
        if (time <= 5) {
            rate = 15;
        } else if (time <= 10) {
            rate = 12;
        } else {
            rate = 10;
        }
        interest = (principal * rate * time) / 100;
        amt = principal + interest;
    }

    void display() {
        System.out.println("Interest: " + interest);
        System.out.println("Amount to pay after " + time + " years: " + amt);
    }
}

public class Loan1 {
    public static void main(String[] args) {
        Loan l = new Loan();
        l.getdata();
        l.calculate();
        l.display();
    }
}