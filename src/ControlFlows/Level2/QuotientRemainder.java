package ControlFlows.Level2;

import java.sql.SQLOutput;
import java.util.Scanner;

// Class to calculate quotient and remainder of two numbers
public class QuotientRemainder {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read first number
        System.out.println("Enter the number1 :");
        double num1 = sc.nextDouble();

        // Read second number
        System.out.println("Enter the number2 :");
        double num2 = sc.nextDouble();

        // Calculate quotient
        double quotient = num1 / num2;

        // Calculate remainder
        double remainder = num1 % num2;

        // Display the results
        System.out.println("The quotient of the number is " + quotient);
        System.out.println("The remainder of the number is " + remainder);
    }
}
