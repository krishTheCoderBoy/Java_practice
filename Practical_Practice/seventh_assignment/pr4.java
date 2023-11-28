package Practical_Practice.seventh_assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class pr4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine().toUpperCase();

            String[] words = sentence.split(" ");
            Map<String, Integer> wordFrequency = new HashMap<>();

            for (String word : words) {
                if (word.length() >= 2) {
                    boolean consecutiveLetters = false;
                    for (int i = 0; i < word.length() - 1; i++) {
                        if (word.charAt(i) + 1 == word.charAt(i + 1)) {
                            consecutiveLetters = true;
                            break;
                        }
                    }
                    if (consecutiveLetters) {
                        wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                    }
                }
            }

            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
            }

            System.out.println("Number of words containing consecutive letters: " + wordFrequency.size());
        }
    }

