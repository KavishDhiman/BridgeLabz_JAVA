package ProgrammingElements.Level2;

import java.util.Scanner;

public class FahrenheitToCelsius {

    /*
     * This program converts temperature
     * from Fahrenheit to Celsius.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(
                fahrenheit + " fahrenheit is " + celsius + " celsius"
        );
    }
}
