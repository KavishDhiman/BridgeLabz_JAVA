/*
 * Problem Statement:
 * ------------------
 * Check whether three given points lie on the same straight line.
 *
 * Description:
 * ------------
 * The class provides two methods to determine collinearity of points
 * using slope comparison and area of triangle approaches.
 */

package Methods.Level3;

// Class to check if three points are collinear
public class ColinearPoints {

    // Method to check collinearity using slope comparison
    public static boolean usingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle method
    public static boolean usingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
}
