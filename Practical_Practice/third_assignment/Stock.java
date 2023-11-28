package Practical_Practice.third_assignment;

import java.util.Scanner;

class Stock1 {
    String title;
    String author;
    String pub;
    int noc;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title, author, publisher's name, number of copies");
        title = sc.nextLine();
        author = sc.nextLine();
        pub = sc.nextLine();
        noc = sc.nextInt();
    }

    void purchase(int t, String a, String p, int n) {
        if (title.equals(t) && author.equals(a) && pub.equals(p)) {
            if (noc > n) {
                noc -= n;
                System.out.println("Book purchased successfully");
            } else {
                System.out.println("Book is not available or stock is underflowing");
            }
        } else {
            System.out.println("Book is not available");
        }
    }
}

public class Stock {
    public static void main(String[] args) {
        Stock1 s = new Stock1();
        s.getdata();
        s.purchase(100, "Author1", "Publisher1", 10);
    }
}
