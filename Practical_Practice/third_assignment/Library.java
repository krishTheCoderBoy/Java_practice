package Practical_Practice.third_assignment;

import java.util.Scanner;

class Library {
    String name;
    int price;
    int day;
    double fine;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the book: ");
        name = scanner.next();
        System.out.println("Enter printed price of the book: ");
        price = scanner.nextInt();
        System.out.println("Enter number of days for which fine is to be paid: ");
        day = scanner.nextInt();
        scanner.close();
    }

    void cal() {
        if (day <= 7) {
            fine = 0.25 * day;
        } else if (day <= 15) {
            fine = 1 + 0.4 * (day - 8);
        } else if (day <= 30) {
            fine = 2 + 0.6 * (day - 16);
        } else {
            fine = 3 + 0.8 * (day - 31);
        }
    }

    void display() {
        System.out.println("Name of the book: " + name);
        System.out.println("Fine to be paid: " + fine + " paise");
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.input();
        library.cal();
        library.display();
    }
}
