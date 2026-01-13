package Methods.Level3;

public class ColinearPoints {

    public static boolean usingSlope(double x1,double y1,double x2,double y2,double x3,double y3) {
        return (y2 - y1)*(x3 - x2) == (y3 - y2)*(x2 - x1);
    }

    public static boolean usingArea(double x1,double y1,double x2,double y2,double x3,double y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }
}
