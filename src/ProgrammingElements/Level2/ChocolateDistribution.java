package ProgrammingElements.Level2;

import java.util.Scanner;

public class ChocolateDistribution {

    /*
     * This program distributes chocolates
     * equally among children.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int eachGets = chocolates / children;
        int remaining = chocolates % children;

        System.out.println(
                "Each child gets " + eachGets +
                        " chocolates and remaining chocolates are " + remaining
        );
    }
}
