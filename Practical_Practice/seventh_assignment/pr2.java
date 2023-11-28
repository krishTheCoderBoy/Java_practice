package Practical_Practice.seventh_assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class pr2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a word: ");
            String input = scanner.nextLine();

            if (isHappyWord(input)) {
                System.out.println("Happy Word");
            } else {
                System.out.println("Not a Happy Word");
            }
        }

        public static boolean isHappyWord(String str) {
            Map<Character, Integer> alphabetMap = new HashMap<>();
            alphabetMap.put('A', 1);
            alphabetMap.put('B', 2);
            alphabetMap.put('C', 3);
            alphabetMap.put('D', 4);
            alphabetMap.put('E', 5);
            alphabetMap.put('F', 6);
            alphabetMap.put('G', 7);
            alphabetMap.put('H', 8);
            alphabetMap.put('I', 9);
            alphabetMap.put('J', 10);
            alphabetMap.put('K', 11);
            alphabetMap.put('L', 12);
            alphabetMap.put('M', 13);
            alphabetMap.put('N', 14);
            alphabetMap.put('O', 15);
            alphabetMap.put('P', 16);
            alphabetMap.put('Q', 17);
            alphabetMap.put('R', 18);
            alphabetMap.put('S', 19);
            alphabetMap.put('T', 20);
            alphabetMap.put('U', 21);
            alphabetMap.put('V', 22);
            alphabetMap.put('W', 23);
            alphabetMap.put('X', 24);
            alphabetMap.put('Y', 25);
            alphabetMap.put('Z', 26);

            int number = 0;
            for (char c : str.toCharArray()) {
                number += alphabetMap.get(c);
            }

            while (number != 1) {
                int sumOfSquares = 0;
                while (number > 0) {
                    int digit = number % 10;
                    sumOfSquares += digit * digit;
                    number /= 10;
                }
                number = sumOfSquares;
            }

            return number == 1;
        }
    }
