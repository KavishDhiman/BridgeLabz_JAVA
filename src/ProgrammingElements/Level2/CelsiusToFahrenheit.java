package ProgrammingElements.Level2;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    /*
     * This program converts temperature
     * from Celsius to Fahrenheit.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(
                celsius + " celsius is " + fahrenheit + " fahrenheit"
        );
    }
}
