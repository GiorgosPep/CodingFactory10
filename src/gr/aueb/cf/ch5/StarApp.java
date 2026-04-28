package gr.aueb.cf.ch5;
import gr.aueb.cf.ch4.ex1.VerticalStarApp;

import java.util.Scanner;

public class StarApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise =0;
        final int EXIT= 6;
        int plithos=0;

        while(true) {
            printMenu();
            choise = scanner.nextInt();

            if (choise == EXIT) {
                System.out.println("Έξοδος");
                break;
            }

            System.out.println("Δώστε αριθμό για αστεράκια: ");
            plithos = scanner.nextInt();

            switch (choise) {
                case 1 -> horizontalStar(plithos);
                case 2 -> verticalStar(plithos);
                case 3 -> nMatrixStar(plithos);
                case 4 -> fromOneToNStar(plithos);
                case 5 -> fromNToOneStar(plithos);
                default -> System.out.println("Παρακαλώ προσπαθήστε ξανά");

            }
        }
    }
    public static void printMenu(){
        System.out.println("\nΠαρακαλώ επιλέξτε μία από τις παρακάτω επιλογές: ");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή: ");

    }

    public static int getPlithos(int plithos){
            Scanner in = new Scanner(System.in) ;

            System.out.println("Δώστε αριθμό για αστεράκια");
            plithos = in.nextInt();
            return plithos;
        }

    public static void horizontalStar(int plithos){
        for (int i = 0; i < plithos; i++){
            System.out.printf("*");
        }
    }
    public static void verticalStar(int plithos) {
        for (int i = 0; i < plithos; i++) {
            System.out.println("*");
        }
    }
    public static void nMatrixStar(int plithos) {
        for (int i =0; i<plithos ; i++) {
            for (int j = 0;j<plithos;j++) {
                System.out.printf("*");
            }
            System.out.println(" ");
        }
    }

    public static void fromNToOneStar(int plithos) {
        for (int i = 0; i < plithos; i++) {
            for (int j = i; j < plithos; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

    public static void fromOneToNStar(int plithos){
        for (int i = 0; i<plithos; i++){
            for (int j =0; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

}

