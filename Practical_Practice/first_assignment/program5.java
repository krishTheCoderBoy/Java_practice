package Practical_Practice.first_assignment;
import java.util.Scanner;
public class program5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a positive integer: ");
            int n = scanner.nextInt();
            scanner.close();

            if (n < 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
            } else {
                System.out.println("Sum of " + n + " terms of the series: " + seriesSum(n));
            }
        }

        private static double seriesSum(int n) {
            double sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += Math.pow(-1, i + 1) * Math.pow(i, 2) / factorial(i * 2 - 1);
            }
            return sum;
        }

        private static long factorial(int n) {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

