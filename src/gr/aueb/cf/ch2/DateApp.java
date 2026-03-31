package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Παρακαλώ επιλέξτε ημέρα: ");
        int day = in.nextInt();
        System.out.println("Παρακαλώ επιλέξτε μήνα: ");
        int month = in.nextInt();
        System.out.println("Παρακαλώ επιλέξτε έτος: ");
        int year = in.nextInt();
        int finYear = (year%1000)%100;
        System.out.printf("Η ημερομινία που επιλέξατε είναι: %02d/%02d/%02d ", day,month,finYear);

    }


}
