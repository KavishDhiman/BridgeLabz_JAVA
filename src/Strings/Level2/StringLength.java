package Strings.Level2;

import java.util.Scanner;

public class StringLength {

    /*
     * This method finds the length of a string
     * without using the built-in length() method.
     * It keeps accessing characters until charAt()
     * throws an exception.
     */
    public static int findLength(String text) {
        int count = 0;

        try {
            // Infinite loop to access characters one by one
            while (true) {
                text.charAt(count); // access character
                count++;            // increment counter
            }
        } catch (Exception e) {
            // Exception occurs when index goes out of range
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        String text = sc.next();

        // Calling custom method
        int customLength = findLength(text);

        // Calling built-in method
        int builtInLength = text.length();

        // Displaying both results
        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}
