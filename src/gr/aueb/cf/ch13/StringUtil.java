package gr.aueb.cf.ch13;

/**
 * This Utility Class provides methods that reverse and capitalize strings
 */
public class StringUtil {

    private StringUtil() {

    }

    /**
     * This method takes a string as input and returns the reversed version of that string.
     * @param str
     * @return
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    /**
     * This method takes a string as input and returns the same string with the
     * first letter capitalized and the rest of the letters unchanged.
     * @param str
     * @return
     */

    public static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
