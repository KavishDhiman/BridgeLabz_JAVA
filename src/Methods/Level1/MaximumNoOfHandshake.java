package Methods.Level1;

import java.util.Scanner;

// Class to calculate the maximum number of handshakes
public class MaximumNoOfHandshake {

    // Method to calculate maximum handshakes using formula n*(n-1)/2
    public static double handshake(double student) {
        return (student * (student - 1)) / 2;
    }

    static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt and read number of students
        System.out.println("Enter the number of students");
        double student = sc.nextDouble();

        // Call handshake method to calculate result
        double hand = handshake(student);

        // Display the result
        System.out.println("The maximun number of handshakes possible are :" + hand);
    }
}
