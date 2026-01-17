package oopsprogrammingfundamentals.level2;
/*
 * Problem Statement:
 * Write a Java program to create a CartItem class that manages
 * item quantity in a shopping cart and calculates total cost.
 */

/*
 * Class Name: CartItem
 *
 * Description:
 * This class represents an item in a shopping cart with attributes
 * such as item name, price, and quantity. It provides methods to add
 * and remove item quantities and to calculate and display the total cost.
 */
public class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        quantity -= qty;
    }

    void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();
        item.itemName = "Book";
        item.price = 300;

        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
