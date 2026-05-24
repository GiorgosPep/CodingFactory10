package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Στο πρόγραμμα ορίζεται ένας πίνακας και χρησιμοποιούνται διάφοροι μέθοδοι
 * για να γίνουν οι πράξεις πινάκων (mapping, filtering, reducing).
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] arr = new int[] {1,2,3,3,4,5,6,11,7,1,0,7,8,9};


        System.out.println("Δίνεται ο πίνακας: {1,2,3,3,4,5,6,11,7,1,0,7,8,9}");

        while(true) {
            System.out.println("Παρακαλώ επιλέξτε ένα στοιχείο");
            int target = scanner.nextInt();
            int count = countElement(arr, target);
            if(count <= 0){
                System.out.println("Δε βρέθηκε το στοιχείο του πίνακα. Παρακαλώ προσπαθήστε ξανά ");
            }
            else{
                System.out.println("Το στοιχείο: " + target + " εμφανίζεται " + count + " φορές ");
                break;
            }
        }
        printEvenNumbers(arr);
        int[] doubleArray = doubleTheElement(arr);
        System.out.println("Υπάρχουν θετικά στοιχεία στον πίνακα " + hasPositive(arr));
        System.out.println("Ο πίνακας έχει όλα τα στοιχεία του θετικά " + areAllPositive(arr));
    }

    /**
     * Η μέθοδος μετράει το στοιχείο που έχει επιλέξει ο χρήστης μέσα στον πίνακα κι επιστρέφει
     * το πλήθος εμφανίσεών του
     * @param array ο πίνακας εισόδου
     * @param element το στοιχείο που έχει επιλέξει ο χρήστης να μετρηθεί μέσα στον πίνακα
     * @return το πλήθος εμφανίσεων του στοιχείου
     */
    public static int countElement(int[] array, int element) {
        int count = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] == element) {
                count++;
            }
        }
        return count;
    }

    /**
     * Η μέθοδος δέχεται έναν πίνακα και τυπώνει τους ζυγούς αριθμούς
     * @param arr Ο πίνακας εισόδου
     */

    public static void printEvenNumbers(int[] arr){

        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * Η μέθοδος δέχεται έναν πίνακα και διπλασιάζει κάθε στοιχείο του, αποθηκεύει την τιμή
     * σε έναν άλλο πίνακα (deepcopy) και τον επιστρέφει
     * @param arr Ο πίνακας εισόδου
     * @return Ο πίνακας με το διπλάσιο του κάθε στοιχείου.
     */
    public static int[] doubleTheElement(int[] arr){
        int[] arr2 = new int[arr.length];
        int index = 0;

        for(int el : arr){
            arr2[index++] = el * 2;
        }
        return arr2;
    }

    /**
     * Η μέθοδος ελέγχει αν υπάρχει θετικός αριθμός στον πίνακα κι επιστρέφει true αν υπάρχει, αλλιώς false
     * @param arr Ο πίνακας εισόδου
     * @return True: Αν υπάρχει θετικό στοιχείο του πίνακα, False: αν δεν υπάρχει θετικό στοιχείο στον πίνακα
     */
    public static boolean hasPositive(int[] arr){
        for(int el : arr){
            if(el > 0) return true;
        }
        return false;
    }

    /**
     * Η μέθοδος ελέγχει αν όλα τα στοιχεία του πίνακα είναι θετικά
     * @param arr Ο πίνακας εισόδου
     * @return True: Αν όλα τα στοιχεία του πίνακα είναι θετικά, False: Αν υπάρχει έστω κι ένα αρνητικό στοιχείο στον
     * πίνακα.
     */
    public static boolean areAllPositive(int[] arr){

        for(int el : arr){
            if(el <= 0) return false;
        }
        return true;
    }
}
