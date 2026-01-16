package ControlFlows.Level2;

import java.util.Scanner;

// Class to find the youngest age and tallest height among three friends
public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read ages of Amar, Akbar, and Anthony
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        // Read heights of Amar, Akbar, and Anthony
        double heightAmar = input.nextDouble();
        double heightAkbar = input.nextDouble();
        double heightAnthony = input.nextDouble();

        // Find the youngest age using Math.min
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));

        // Find the tallest height using Math.max
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        // Display the results
        System.out.println("The youngest age is " + youngestAge);
        System.out.println("The tallest height is " + tallestHeight);
    }
}
