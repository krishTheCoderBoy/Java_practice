package Practical_Practice.seventh_assignment;
import java.util.Scanner;
public class pr3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a word: ");
            String word = scanner.nextLine();

            boolean isPalindrome = false;
            boolean isSpecialWord = false;

            if (word.equals(new StringBuilder(word).reverse().toString())) {
                isPalindrome = true;
            }

            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                isSpecialWord = true;
            }

            if (isPalindrome && isSpecialWord) {
                System.out.println("The word is a palindrome and a special word.");
            } else if (isPalindrome) {
                System.out.println("The word is a palindrome.");
            } else if (isSpecialWord) {
                System.out.println("The word is a special word.");
            } else {
                System.out.println("The word is neither a palindrome nor a special word.");
            }
        }
    }
