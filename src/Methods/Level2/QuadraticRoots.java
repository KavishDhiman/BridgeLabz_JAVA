package Methods.Level2;

import java.util.Scanner;

// Class to find roots of a quadratic equation
public class QuadraticRoots {

    // Method to calculate roots based on the discriminant value
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        // No real roots if discriminant is negative
        if (delta < 0) return new double[0];

        // One real root if discriminant is zero
        if (delta == 0)
            return new double[]{ -b / (2 * a) };

        // Two real roots if discriminant is positive
        double sqrt = Math.sqrt(delta);
        return new double[]{
                (-b + sqrt) / (2 * a),
                (-b - sqrt) / (2 * a)
        };
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read coefficients of the quadratic equation
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // Find roots using the method
        double[] roots = findRoots(a, b, c);

        // Print the roots
        for (double r : roots)
            System.out.println(r);
    }
}
