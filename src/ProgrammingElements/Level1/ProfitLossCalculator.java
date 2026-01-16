package ProgrammingElements.Level1;

public class ProfitLossCalculator {

    /*
     * This program calculates profit and profit percentage
     * using cost price and selling price.
     */
    public static void main(String[] args) {

        // Given cost price and selling price
        double costPrice = 129;
        double sellingPrice = 191;

        // Profit is selling price minus cost price
        double profit = sellingPrice - costPrice;

        // Profit percentage formula
        double profitPercentage = (profit / costPrice) * 100;

        // Displaying all details using a single print statement
        System.out.println(
                "The Cost Price is INR " + costPrice +
                        " and Selling Price is INR " + sellingPrice +
                        "\nThe Profit is INR " + profit +
                        " and the Profit Percentage is " + profitPercentage
        );
    }
}
