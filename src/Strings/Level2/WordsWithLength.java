package Strings.Level2;

import java.util.Scanner;

public class WordsWithLength {

    /*
     * This method converts word array into
     * a 2D array containing word and its length.
     */
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];                        // word
            result[i][1] = String.valueOf(words[i].length()); // length
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking sentence input
        String text = sc.nextLine();

        // Splitting sentence
        String[] words = text.split(" ");

        // Getting word-length mapping
        String[][] data = wordsWithLength(words);

        // Displaying result in tabular format
        System.out.println("Word\tLength");
        for (String[] row : data) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
