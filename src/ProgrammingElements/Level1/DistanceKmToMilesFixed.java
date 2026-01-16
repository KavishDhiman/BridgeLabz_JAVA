package ProgrammingElements.Level1;

public class DistanceKmToMilesFixed {

    /*
     * This program converts a fixed distance
     * from kilometers to miles.
     */
    public static void main(String[] args) {

        // Distance given in kilometers
        double km = 10.8;

        // Conversion formula (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Displaying the converted distance
        System.out.println("The distance " + km +
                " km in miles is " + miles);
    }
}
