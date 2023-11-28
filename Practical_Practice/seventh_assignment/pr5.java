package Practical_Practice.seventh_assignment;
import java.util.Scanner;
public class pr5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] cities = {"DELHI", "MUMBAI", "KOLKATA", "CHENNAI", "BANGALORE", "PUNE", "JAIPUR", "AMRITSAR", "BHOPAL", "MEERUT"};
            int[] stdCodes = {120, 110, 112, 113, 115, 116, 117, 118, 119, 121};

            System.out.println("Enter the name of a city: ");
            String cityName = scanner.nextLine().toUpperCase();

            for (int i = 0; i < cities.length; i++) {
                if (cities[i].equals(cityName)) {
                    System.out.println("Search Successful");
                    System.out.println("City: " + cities[i] + ", STD Code: " + stdCodes[i]);
                    break;
                }
            }

            System.out.println("Entered city not found in the list. Search unsuccessful.");
        }
    }

