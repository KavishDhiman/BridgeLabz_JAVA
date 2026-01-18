/*
 * Problem Statement:
 * ------------------
 * Provide methods to convert values between different measurement units.
 *
 * Description:
 * ------------
 * The class contains multiple static methods to perform common unit
 * conversions for length, temperature, weight, and volume.
 */

package Methods.Level2;

// Class that provides various unit conversion methods
public class UnitConverter {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double m) {
        return m * 3.28084;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double f) {
        return f * 0.3048;
    }

    // Convert yards to feet
    public static double convertYardsToFeet(double y) {
        return y * 3;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double f) {
        return f * 0.333333;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double m) {
        return m * 39.3701;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double i) {
        return i * 0.0254;
    }

    // Convert inches to centimeters
    public static double convertInchesToCm(double i) {
        return i * 2.54;
    }

    // Convert Fahrenheit temperature to Celsius
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Convert Celsius temperature to Fahrenheit
    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKg(double p) {
        return p * 0.453592;
    }

    // Convert kilograms to pounds
    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double g) {
        return g * 3.78541;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }
}
