import java.util.Scanner;

public class WorkApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hours;
        int workers;
        System.out.println("Παρακαλώ εισάγετε ώρες που απαιτούνται για το project ");
        hours = in.nextInt();
        System.out.println("Παρακαλώ εισάγετε αριθμό εργαζομένων που θα ασχοληθούν με το project ");
        workers = in.nextInt();

        int hoursPerWorker;
        hoursPerWorker= hours/workers;
        int hoursRemaining;
        hoursRemaining = hours%workers;

        System.out.printf("Κάθε εργαζόμενος έχει %d ώρες. Ώρες που περισσεύουν: %d", hoursPerWorker, hoursRemaining);
    }
}
