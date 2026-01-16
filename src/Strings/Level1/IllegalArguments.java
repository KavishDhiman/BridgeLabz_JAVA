package Strings.Level1;

import java.util.Scanner;

// Class to demonstrate IllegalArgumentException using substring()
public class IllegalArguments {

    // Method that generates an exception by passing invalid substring indexes
    static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    // Method that handles the exception using try-catch
    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read input string
        String text = sc.next();

        // Call method that safely handles the exception
        // generateException(text);
        handleException(text);
    }
}
