package Practical_Practice.sixth_assignment;
import java.util.Scanner;

public class p1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string in upper case: ");
            String input = scanner.nextLine();
            System.out.println("Output: " + replaceVowels(input));
        }

        private static String replaceVowels(String input) {
            StringBuilder result = new StringBuilder();
            for (char c : input.toCharArray()) {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    result.append('*');
                } else {
                    result.append(c);
                }
            }
            return result.toString();
        }
    }
