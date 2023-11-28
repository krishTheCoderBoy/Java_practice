package Practical_Practice.first_assignment;
import java.util.Scanner;
public class program3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a positive integer number: ");
            String input = scanner.nextLine();
            int number;

            try {
                number = Integer.parseInt(input);

                if (number > 0) {
                    System.out.println("Prime numbers between 1 and " + number + " are: ");
                    for (int i = 2; i <= number; i++) {
                        if (isPrime(i)) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                } else {
                    System.out.println("Error: The input number should be greater than 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a positive integer number.");
            }
        }

        private static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

}
