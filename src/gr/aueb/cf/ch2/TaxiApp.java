package gr.aueb.cf.ch2;

import java.util.Scanner;

public class TaxiApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int euro;
        int cent;
        int charge;
        System.out.println("Παρακαλώ εισάγετε χιλιόμετρα απόστασης: ");
        int dist = in.nextInt();
        charge = dist*374;
        euro = charge/100;
        cent = charge%100;
        System.out.printf("Κόστος: %d ευρώ και %d λεπτά.",euro, cent);

    }
}
