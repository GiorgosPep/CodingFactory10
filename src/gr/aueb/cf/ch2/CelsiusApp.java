package gr.aueb.cf.ch2;
import java.util.Scanner;
public class CelsiusApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int degree;
        final int c = 32;
        final int a = 5;
        final int b = 9;
        int finDegree;

        System.out.println("Παρακαλώ εισάγετε θερμοκρασία σε Fahrenheit: ");
        degree = in.nextInt();
        finDegree = a * (degree - c) / b ;
        System.out.printf("Η ένδειξη σε βαθμούς Κελσίου είναι: %d °C",finDegree);
    }
}
