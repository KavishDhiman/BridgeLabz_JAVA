package ProgrammingElements.Level1;

public class PenDistribution {

    /*
     * This program divides pens equally among students
     * and also finds the remaining pens.
     */
    public static void main(String[] args) {

        // Total pens and students
        int pens = 14;
        int students = 3;

        // Division gives number of pens per student
        int pensPerStudent = pens / students;

        // Modulus gives remaining pens
        int remainingPens = pens % students;

        // Displaying the result
        System.out.println("The Pen Per Student is " +
                pensPerStudent +
                " and the remaining pen not distributed is " +
                remainingPens);
    }
}
