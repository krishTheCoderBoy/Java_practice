package Practical_Practice.sixth_assignment;
import java.util.Scanner;
public class p3 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine();
            System.out.println("Palindrome words in the sentence: ");
            printPalindromeWords(sentence);
        }

        public static void printPalindromeWords(String sentence) {
            String[] words = sentence.split(" ");
            for (String word : words) {
                if (isPalindrome(word)) {
                    System.out.println(word);
                }
            }
        }

        public static boolean isPalindrome(String word) {
            int start = 0;
            int end = word.length() - 1;
            while (start < end) {
                if (word.charAt(start) != word.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

}
