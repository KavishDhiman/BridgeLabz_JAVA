package ProgrammingElements.Level1;

import java.util.Scanner;

public class CourseFeeDiscountInput {

    /*
     * This program calculates discount and final fee
     * based on user input values.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking fee and discount percentage from user
        double fee = sc.nextDouble();
        double discountPercent = sc.nextDouble();

        // Calculating discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculating final fee
        double finalFee = fee - discount;

        // Displaying the result
        System.out.println("The discount amount is INR " +
                discount +
                " and final discounted fee is INR " +
                finalFee);
    }
}
