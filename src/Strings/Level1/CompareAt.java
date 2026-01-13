package Strings.Level1;

import java.util.Scanner;

public class CompareAt {

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.println("Enter first string:");
        String str1 = sc.next();

        System.out.println("Enter second string:");
        String str2 = sc.next();

        // Compare using charAt()
        boolean charAtResult = compareStrings(str1, str2);

        // Compare using equals()
        boolean equalsResult = str1.equals(str2);

        // Output
        System.out.println("Result using charAt(): " + charAtResult);
        System.out.println("Result using equals(): " + equalsResult);

        if (charAtResult == equalsResult) {
            System.out.println("Both results are same");
        } else {
            System.out.println("Results are different");
        }
    }
}
