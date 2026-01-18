/*
 * Problem Statement:
 * ------------------
 * Generate multiple one-time passwords (OTPs) and verify their uniqueness.
 *
 * Description:
 * ------------
 * The program generates random 6-digit OTPs, stores them in an array,
 * and checks whether all generated OTPs are unique.
 */

package Methods.Level3;

import java.util.Random;

// Class to generate OTPs and check their uniqueness
public class OTPGenerator {

    // Method to generate a 6-digit random OTP
    static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }

    // Method to check whether all OTPs in the array are unique
    static boolean allUnique(int[] arr) {
        // Compare each OTP with others
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] == arr[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        // Array to store generated OTPs
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++)
            otps[i] = generateOTP();

        // Check and display whether all OTPs are unique
        System.out.println("Unique OTPs: " + allUnique(otps));
    }
}
