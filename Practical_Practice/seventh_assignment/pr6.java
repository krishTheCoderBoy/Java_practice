package Practical_Practice.seventh_assignment;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class pr6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string: ");
            String input = scanner.nextLine();

            Map<Character, Integer> frequencyMap = new HashMap<>();

            for (char c : input.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            System.out.println("Character frequencies: ");
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            StringBuilder result = new StringBuilder();

            for (char c : input.toCharArray()) {
                if (!result.toString().contains(String.valueOf(c))) {
                    result.append(c);
                }
            }

            System.out.println("String with duplicate characters removed: " + result.toString());
        }
    }

