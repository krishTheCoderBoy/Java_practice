package Practical_Practice.third_assignment;

import java.util.Scanner;

class Honda {
    int type;
    int cost;

    void gettype() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of engine and previous cost");
        type = sc.nextInt();
        cost = sc.nextInt();
    }

    void find() {
        double rate;
        if (type == 2) {
            rate = 1.10;
        } else {
            rate = 1.12;
        }
        cost = (int) (cost * rate);
    }

    void printcost() {
        System.out.println("Type of Engine: " + type);
        System.out.println("New Cost: " + cost);
    }
}

public class Honda1 {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.gettype();
        h.find();
        h.printcost();
    }
}