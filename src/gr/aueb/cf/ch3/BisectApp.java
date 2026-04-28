package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BisectApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DIVIDE1 = 100;
        final int DIVIDE2 = 4;
        int year = 0;
        boolean isBisect = false;

        System.out.println("Παρακαλώ εισάγετε έτος: ");
        year = scanner.nextInt();
        isBisect = (((year%DIVIDE2)==0) && (year % DIVIDE1 != 0));
        System.out.println("Το έτος είναι δίσεκτο: " + isBisect);

    }
}
