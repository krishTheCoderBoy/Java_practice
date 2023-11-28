package Practical_Practice.first_assignment;
import java.util.Scanner;
public class program4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a positive integer: ");
            String input = scanner.nextLine();

            try {
                int n = Integer.parseInt(input);
                if (n < 0) {
                    System.out.println("Error: Negative input not allowed. Please enter a positive integer.");
                } else {
                    long fib = fibonacci(n);
                    System.out.println("Fibonacci(" + n + ") = " + fib);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a positive integer.");
            }

            scanner.close();
        }

        private static long fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            long fib1 = 0;
            long fib2 = 1;

            for (int i = 2; i <= n; i++) {
                long temp = fib2;
                fib2 = fib1 + fib2;
                fib1 = temp;
            }
            return fib2;
        }
    }

