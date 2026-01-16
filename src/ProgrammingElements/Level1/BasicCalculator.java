package ProgrammingElements.Level1;

import java.util.Scanner;

public class BasicCalculator {

    /*
     * This program performs basic arithmetic operations
     * like addition, subtraction, multiplication, and division
     * using two user-input numbers.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking two floating-point numbers as input
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        // Performing arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Displaying all results together
        System.out.println(
                "The addition, subtraction, multiplication and division value of 2 numbers " +
                        number1 + " and " + number2 +
                        " is " + addition + ", " +
                        subtraction + ", " +
                        multiplication + ", and " +
                        division
        );
    }
}
