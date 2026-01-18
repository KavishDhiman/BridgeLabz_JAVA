/*
 * Problem Statement:
 * ------------------
 * Compare two strings using character comparison and built-in methods.
 *
 * Description:
 * ------------
 * The program compares two strings using a custom charAt() based method
 * and the built-in equals() method, then verifies whether both results match.
 */

package Strings.Level1;

import java.util.Scanner;

// Class to compare two strings using charAt() and equals()
public class CompareAt {

    // Method to compare two strings character by character using charAt()
    public static boolean compareStrings(String s1, String s2) {

        // If lengths differ, strings cannot be equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Loop to compare each character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Take first string input
        System.out.println("Enter first string:");
        String str1 = sc.next();

        // Take second string input
        System.out.println("Enter second string:");
        String str2 = sc.next();

        // Compare strings using custom charAt() method
        boolean charAtResult = compareStrings(str1, str2);

        // Compare strings using built-in equals() method
        boolean equalsResult = str1.equals(str2);

        // Print comparison results
        System.out.println("Result using charAt(): " + charAtResult);
        System.out.println("Result using equals(): " + equalsResult);

        // Check if both comparison methods give the same result
        if (charAtResult == equalsResult) {
            System.out.println("Both results are same");
        } else {
            System.out.println("Results are different");
        }
    }
}
