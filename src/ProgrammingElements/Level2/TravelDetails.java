package ProgrammingElements.Level2;

import java.util.Scanner;

public class TravelDetails {

    /*
     * This program collects travel details
     * and displays the journey information.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String fromCity = sc.next();
        String viaCity = sc.next();
        String toCity = sc.next();

        double fromToVia = sc.nextDouble();
        double viaToFinal = sc.nextDouble();
        double timeTaken = sc.nextDouble();

        System.out.println(
                "Traveller: " + name +
                        "\nRoute: " + fromCity + " -> " + viaCity + " -> " + toCity +
                        "\nTotal Distance: " + (fromToVia + viaToFinal) +
                        "\nTime Taken: " + timeTaken
        );
    }
}
