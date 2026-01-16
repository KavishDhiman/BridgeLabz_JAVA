package Strings.Level1;

import java.util.Scanner;

// Class to compare manual uppercase conversion with built-in toUpperCase()
public class UppercaseComparison {

    // Method to convert a string to uppercase manually
    static String manualUppercase(String text) {
        String result = "";

        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Convert lowercase character to uppercase
            if (c >= 'a' && c <= 'z')
                result += (char) (c - 32);
            else
                result += c;
        }
        return result;
    }

    // Method to compare two strings character by character
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;

        // Loop to check each character
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;

        return true;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read input string
        String text = sc.nextLine();

        // Convert string to uppercase manually
        String manual = manualUppercase(text);

        // Convert string to uppercase using built-in method
        String builtIn = text.toUpperCase();

        // Compare both results
        System.out.println(compare(manual, builtIn));
    }
}
