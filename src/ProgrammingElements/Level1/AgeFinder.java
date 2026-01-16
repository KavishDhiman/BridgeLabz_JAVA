package Level1;

// Class to calculate age based on birth year and current year
public class AgeFinder {
    static void main(String[] args) {

        // Birth year of the person
        int birthYear = 2000;

        // Current year
        int currentYear = 2024;

        // Calculate age
        int age = currentYear - birthYear;

        // Display the calculated age
        System.out.println("Harry's age in 2024 is " + age);
    }
}
