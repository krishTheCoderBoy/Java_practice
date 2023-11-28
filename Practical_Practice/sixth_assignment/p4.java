package Practical_Practice.sixth_assignment;
import java.util.Scanner;
public class p4 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine();
            System.out.println("Reversed sentence: ");
            printReversedWords(sentence);
        }

        public static void printReversedWords(String sentence) {
            String[] words = sentence.split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
        }

}
