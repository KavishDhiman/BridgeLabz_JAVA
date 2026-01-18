/*
 * Problem Statement:
 * ------------------
 * Generate a substring manually and compare it with the built-in method.
 *
 * Description:
 * ------------
 * The program creates a substring using character-by-character extraction
 * and compares it with Java’s built-in substring() method to verify correctness.
 */

package Strings.Level1;

import java.util.Scanner;

// Class to compare manual substring creation with built-in substring method
public class SubstringComparison {

    // Method to create substring manually using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";

        // Loop to build substring character by character
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        // Loop to compare each character
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) return false;

        return true;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read string and substring range
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        // Generate substrings using manual and built-in methods
        String manual = substringUsingCharAt(text, start, end);
        String builtIn = text.substring(start, end);

        // Display results
        System.out.println("Manual Substring: " + manual);
        System.out.println("Built-in Substring: " + builtIn);
        System.out.println("Are Equal: " + compareStrings(manual, builtIn));
    }
}
