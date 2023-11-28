package Practical_Practice.fourth_assignment;

import java.util.Scanner;

class Distance {
    private int kilometer;
    private int meter;
    private int centimeter;

    Distance() {
        kilometer = 0;
        meter = 0;
        centimeter = 0;
    }

    Distance(int k, int m, int c) {
        kilometer = k;
        meter = m;
        centimeter = c;
    }

    Distance(Distance d) {
        kilometer = d.kilometer;
        meter = d.meter;
        centimeter = d.centimeter;
    }

    void addDistance(Distance d) {
        centimeter += d.centimeter;
        meter += d.meter;
        kilometer += d.kilometer;

        if (centimeter >= 100) {
            centimeter -= 100;
            meter++;
        }

        if (meter >= 1000) {
            meter -= 1000;
            kilometer++;
        }
    }

    Distance addDistance(Distance d1, Distance d2) {
        Distance temp = new Distance();
        temp.centimeter = d1.centimeter + d2.centimeter;
        temp.meter = d1.meter + d2.meter;
        temp.kilometer = d1.kilometer + d2.kilometer;

        if (temp.centimeter >= 100) {
            temp.centimeter -= 100;
            temp.meter++;
        }

        if (temp.meter >= 1000) {
            temp.meter -= 1000;
            temp.kilometer++;
        }

        return temp;
    }

    void display() {
        System.out.println("Kilometer: " + kilometer);
        System.out.println("Meter: " + meter);
        System.out.println("Centimeter: " + centimeter);
    }
}

public class Distance1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the details of the first distance: ");
        int k1 = in.nextInt();
        int m1 = in.nextInt();
        int c1 = in.nextInt();

        Distance d1 = new Distance(k1, m1, c1);

        System.out.println("Enter the details of the second distance: ");
        int k2 = in.nextInt();
        int m2 = in.nextInt();
        int c2 = in.nextInt();

        Distance d2 = new Distance(k2, m2, c2);

        Distance result = d1.addDistance(d1, d2);
        result.display();
    }
}
