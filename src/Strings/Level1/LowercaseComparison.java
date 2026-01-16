package Strings.Level1;

import java.util.Scanner;

// Class to compare manual lowercase conversion with built-in lowercase method
public class LowercaseComparison {

    // Method to convert a string to lowercase manually
    static String manualLowercase(String text) {
        String result = "";

        // Loop through each character of the string
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Convert uppercase character to lowercase
            if (c >= 'A' && c <= 'Z')
                result += (char) (c + 32);
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

        // Convert string to lowercase manually
        String manual = manualLowercase(text);

        // Convert string to lowercase using built-in method
        String builtIn = text.toLowerCase();

        // Compare both results and print outcome
        System.out.println(compare(manual, builtIn));
    }
}
