package Strings.Level2;

import java.util.Scanner;

public class SplitWordComparison {

    /*
     * This method splits a sentence into words
     * without using the split() method.
     */
    public static String[] splitWords(String text) {

        // Counting number of words
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                wordCount++;
        }

        // Creating array to store words
        String[] words = new String[wordCount];

        int index = 0;
        int start = 0;

        // Extracting each word
        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    /*
     * This method compares two string arrays
     * element by element.
     */
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking full sentence input
        String text = sc.nextLine();

        // Custom split
        String[] customSplit = splitWords(text);

        // Built-in split
        String[] builtInSplit = text.split(" ");

        // Comparing results
        System.out.println("Are both results same? "
                + compareArrays(customSplit, builtInSplit));
    }
}
