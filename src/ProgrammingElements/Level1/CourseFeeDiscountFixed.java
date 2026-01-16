package ProgrammingElements.Level1;

public class CourseFeeDiscountFixed {

    /*
     * This program calculates the discount
     * and final fee using fixed values.
     */
    public static void main(String[] args) {

        // Original course fee
        double fee = 125000;

        // Discount percentage
        double discountPercent = 10;

        // Calculating discount amount
        double discount = (fee * discountPercent) / 100;

        // Final fee after discount
        double finalFee = fee - discount;

        // Displaying discount and final fee
        System.out.println("The discount amount is INR " +
                discount +
                " and final discounted fee is INR " +
                finalFee);
    }
}
