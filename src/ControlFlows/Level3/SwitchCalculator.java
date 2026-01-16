package ControlFlows.Level3;

import java.util.Scanner;

// Class to perform basic arithmetic operations using switch case
public class SwitchCalculator {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner input = new Scanner(System.in);

        // Read two numbers for calculation
        double first = input.nextDouble();
        double second = input.nextDouble();

        // Read the operator
        String op = input.next();

        // Perform operation based on operator
        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;
            case "-":
                System.out.println("Result = " + (first - second));
                break;
            case "*":
                System.out.println("Result = " + (first * second));
                break;
            case "/":
                // Check for division by zero
                if (second != 0)
                    System.out.println("Result = " + (first / second));
                else
                    System.out.println("Division by zero not allowed");
                break;
            default:
                // Handle invalid operator
                System.out.println("Invalid Operator");
        }
    }
}
