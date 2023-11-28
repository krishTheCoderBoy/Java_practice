package Practical_Practice.first_assignment;
import java.util.Scanner;
public class program2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two positive integer numbers: ");
            String input1 = scanner.nextLine();
            String input2 = scanner.nextLine();
            int number1;
            int number2;

            try {
                number1 = Integer.parseInt(input1);
                number2 = Integer.parseInt(input2);

                if (number1 >= 0 && number2 >= 0) {
                    int gcd = calculateGCD(number1, number2);
                    System.out.println("The GCD of " + number1 + " and " + number2 + " is " + gcd);
                } else {
                    System.out.println("Error: GCD function is not defined for negative values.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter two positive integer numbers.");
            }
        }

        private static int calculateGCD(int number1, int number2) {
            if (number2 == 0) {
                return number1;
            }
            return calculateGCD(number2, number1 % number2);
        }
    }

