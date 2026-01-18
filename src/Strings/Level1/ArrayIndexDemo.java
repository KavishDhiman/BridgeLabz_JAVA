/*
 * Problem Statement:
 * ------------------
 * Demonstrate ArrayIndexOutOfBoundsException and its handling.
 *
 * Description:
 * ------------
 * The program intentionally accesses an invalid array index to show how
 * an exception occurs and how it can be handled using try-catch.
 */

package Strings.Level1;

// Class to demonstrate ArrayIndexOutOfBoundsException
public class ArrayIndexDemo {

    // Method that generates an exception by accessing an invalid index
    static void generateException() {
        String[] names = {"A", "B", "C"};
        System.out.println(names[5]);
    }

    // Method that handles the exception using try-catch
    static void handleException() {
        try {
            String[] names = {"A", "B", "C"};
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        // Call method that handles the exception safely
        // generateException();
        handleException();
    }
}
