package Practical_Practice.Second_assignment;

import java.util.Scanner;

public class Sort {

    private int[] array;

    public void arrange() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to search: ");
        int key = scanner.nextInt();
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == key) {
                System.out.println("Number found at index: " + mid);
                return;
            }
            if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Number not found in the array");
        scanner.close();
    }

    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.array = new int[]{12, 4, 20, 3, 7, 22, 15, 28, 17, 13};
        sort.arrange();
        sort.search();
    }
}
