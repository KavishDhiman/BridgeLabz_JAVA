package Strings.Level2;

import java.util.Scanner;

public class ShortestLongestWord {

    /*
     * This method finds the shortest and longest
     * word from an array of words.
     */
    public static String[] findShortestLongest(String[] words) {
        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (word.length() < shortest.length())
                shortest = word;

            if (word.length() > longest.length())
                longest = word;
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        String text = sc.nextLine();

        // Splitting sentence into words
        String[] words = text.split(" ");

        // Finding shortest and longest words
        String[] result = findShortestLongest(words);

        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}
