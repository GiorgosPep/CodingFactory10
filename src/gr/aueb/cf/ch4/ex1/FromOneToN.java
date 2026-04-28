package gr.aueb.cf.ch4.ex1;

import java.util.Scanner;

public class FromOneToN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Παρακαλώ εισάγετε το πλήθος");
        num = scanner.nextInt();

        for (int i = 0; i<num; i++){
            for (int j =0; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}


