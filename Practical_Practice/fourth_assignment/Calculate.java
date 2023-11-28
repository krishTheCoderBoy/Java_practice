package Practical_Practice.fourth_assignment;

import java.util.Scanner;

public class Calculate {
    private int num;
    private int f;
    private int rev;

    Calculate(int n) {
        num = n;
        f = 0;
        rev = 0;
    }

    int prime() {
        if (num <= 1) {
            return 0;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    int reverse() {
        int numRev = num;
        while (numRev != 0) {
            rev = rev * 10 + numRev % 10;
            numRev = numRev / 10;
        }
        return rev;
    }

    void display() {
        if (prime() == 1 && num == reverse()) {
            System.out.println(num + " is a prime palindrome number.");
        } else if (prime() == 1) {
            System.out.println(num + " is a prime number.");
        } else if (num == reverse()) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a prime or palindrome number.");
        }
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate(0);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        calculate.num = in.nextInt();
        calculate.display();
    }
}
