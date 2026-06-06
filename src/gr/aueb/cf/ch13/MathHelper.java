package gr.aueb.cf.ch13;

/**
 * This Utility Class provides static methods to find the minimum and maximum values in an array of integers.
 */
public class MathHelper {

    private MathHelper(){

    }

    /**
     * This method finds and returns the minimum value in an array of integers.
     * @param arr the array of integers
     * @return the minimum value in the array
     */
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * This method finds and returns the maximum value in an array of integers.
     * @param arr the array of integers
     * @return the maximum value in the array
     */
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
