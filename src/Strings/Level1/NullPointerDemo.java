/*
 * Problem Statement:
 * ------------------
 * Demonstrate NullPointerException and its handling.
 *
 * Description:
 * ------------
 * The program attempts to access a method on a null reference to show how
 * NullPointerException occurs and how it can be handled using try-catch.
 */

package Strings.Level1;

// Class to demonstrate NullPointerException
public class NullPointerDemo {

    // Method that generates a NullPointerException
    static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    // Method that handles NullPointerException using try-catch
    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        // Call method that safely handles the exception
        // generateException(); // Uncomment to see crash
        handleException();
    }
}
