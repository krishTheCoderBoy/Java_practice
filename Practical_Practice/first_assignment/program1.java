package Practical_Practice.first_assignment;
import java.util.Scanner;
public class program1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer number: ");
        String input = scanner.nextLine();
        int number;

        try {
            number = Integer.parseInt(input);
            if (number >= 0) {
                long factorial = calculateFactorial(number);
                System.out.println("The factorial of " + number + " is " + factorial);
            } else {
                System.out.println("Error: Factorial function is not defined for negative values.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a positive integer number.");
        }
    }

    private static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
