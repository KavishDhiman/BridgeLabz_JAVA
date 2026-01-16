package Methods.Level1;

import java.util.Scanner;

// Class to find the smallest and largest among three numbers
public class SmallestAndLargest {

    // Method to determine smallest and largest values
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read three numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Call method to get smallest and largest values
        int[] result = findSmallestAndLargest(a, b, c);

        // Display the results
        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest = " + result[1]);
    }
}
