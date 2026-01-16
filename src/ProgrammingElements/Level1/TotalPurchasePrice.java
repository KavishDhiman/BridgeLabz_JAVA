package ProgrammingElements.Level1;

import java.util.Scanner;

public class TotalPurchasePrice {

    /*
     * This program calculates the total purchase price
     * using unit price and quantity entered by the user.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking unit price and quantity
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        // Displaying total purchase price
        System.out.println(
                "The total purchase price is INR " +
                        totalPrice +
                        " if the quantity " +
                        quantity +
                        " and unit price is INR " +
                        unitPrice
        );
    }
}
