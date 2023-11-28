package Practical_Practice.seventh_assignment;
import java.util.HashSet;
import java.util.Scanner;
public class pr1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();

            if (isUnique(input)) {
                System.out.println("Unique String");
            } else {
                System.out.println("Not a Unique String");
            }
        }

        public static boolean isUnique(String str) {
            HashSet<Character> set = new HashSet<>();
            for (char c : str.toCharArray()) {
                if (set.contains(c)) {
                    return false;
                }
                set.add(c);
            }
            return true;
        }
}
