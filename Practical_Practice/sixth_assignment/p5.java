package Practical_Practice.sixth_assignment;
import java.util.Scanner;
public class p5 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine();
            System.out.println("Word with maximum vowels: ");
            printWordWithMaxVowels(sentence);
        }

        public static void printWordWithMaxVowels(String sentence) {
            String[] words = sentence.split(" ");
            int maxVowels = 0;
            String wordWithMaxVowels = "";

            for (String word : words) {
                int count = countVowels(word);
                if (count > maxVowels) {
                    maxVowels = count;
                    wordWithMaxVowels = word;
                }
            }

            System.out.println(wordWithMaxVowels);
        }

        public static int countVowels(String word) {
            int count = 0;
            String lowerCaseWord = word.toLowerCase();

            for (char c : lowerCaseWord.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            return count;
        }

}
