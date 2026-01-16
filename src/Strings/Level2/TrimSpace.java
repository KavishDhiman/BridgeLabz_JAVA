package Strings.Level2;

import java.util.Scanner;

public class TrimSpace {

    /*
     * This method finds the starting and ending
     * index of text excluding spaces.
     */
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Remove leading spaces
        while (start <= end && text.charAt(start) == ' ')
            start++;

        // Remove trailing spaces
        while (end >= start && text.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text
        String text = sc.nextLine();

        // Getting trimmed indexes
        int[] index = findTrimIndexes(text);

        // Creating trimmed string using custom logic
        String customTrim = text.substring(index[0], index[1] + 1);

        // Built-in trim
        String builtInTrim = text.trim();

        // Comparing results
        System.out.println("Both results same? "
                + customTrim.equals(builtInTrim));
    }
}
