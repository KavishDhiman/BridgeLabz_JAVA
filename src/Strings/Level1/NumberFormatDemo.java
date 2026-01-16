package Strings.Level1;

import java.util.Scanner;

// Class to demonstrate NumberFormatException
public class NumberFormatDemo {

    // Method that generates a NumberFormatException for invalid input
    static void generateException(String text) {
        int num = Integer.parseInt(text);
    }

    // Method that handles NumberFormatException using try-catch
    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
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
