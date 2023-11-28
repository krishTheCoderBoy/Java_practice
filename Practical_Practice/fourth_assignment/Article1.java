package Practical_Practice.fourth_assignment;

import java.util.Scanner;

class Article {
    private double printedPrice;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the printed price of the article: ");
        printedPrice = in.nextDouble();
    }

    double Discount() {
        return printedPrice * 0.9;
    }

    double Discount(int firstDiscount) {
        return Discount() * (100 - firstDiscount) / 100;
    }

    double Discount(int firstDiscount, int secondDiscount) {
        return Discount(firstDiscount) * (100 - secondDiscount) / 100;
    }

    double Discount(int firstDiscount, int secondDiscount, int thirdDiscount) {
        return Discount(firstDiscount, secondDiscount) * (100 - thirdDiscount) / 100;
    }

    void display(double amountToBePaid) {
        System.out.println("Printed price of the article: " + printedPrice);
        System.out.println("Amount to be paid by the customer after getting discounts on the printed price: ₹" + amountToBePaid);
    }
}

public class Article1 {
    public static void main(String[] args) {
        Article article = new Article();
        article.input();

        int firstDiscount = 10;
        int secondDiscount = 8;
        int thirdDiscount = 5;

        double amountToBePaid = article.Discount(firstDiscount, secondDiscount, thirdDiscount);
        article.display(amountToBePaid);
    }
}
