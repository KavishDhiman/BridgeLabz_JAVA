package ProgrammingElements.Level1;

import java.util.Scanner;

public class HandshakeCalculator {

    /*
     * This program calculates the maximum number of handshakes
     * possible among N students using the combination formula.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of students as input
        int numberOfStudents = sc.nextInt();

        // Handshake formula: n * (n - 1) / 2
        int handshakes =
                (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Displaying the result
        System.out.println(
                "The maximum number of handshakes possible are " +
                        handshakes
        );
    }
}
