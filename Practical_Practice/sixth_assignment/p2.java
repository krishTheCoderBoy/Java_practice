package Practical_Practice.sixth_assignment;
import java.util.Scanner;
public class p2 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine();
            String longestWord = getLongestWord(sentence);
            int longestWordLength = getLongestWordLength(sentence);
            System.out.println("The longest word: " + longestWord + ": The length of the word: " + longestWordLength);
        }

        public static String getLongestWord(String sentence) {
            String longestWord = "";
            String[] words = sentence.split(" ");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            return longestWord;
        }

        public static int getLongestWordLength(String sentence) {
            String longestWord = "";
            String[] words = sentence.split(" ");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            return longestWord.length();
        }
    }
