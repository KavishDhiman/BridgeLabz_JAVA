package Methods.Level3;

import java.util.Random;

// Class to generate OTPs and verify their uniqueness
public class UniqueOTPGenerator {

    // Method to generate a 6-digit random OTP
    public static int generateOTP() {
        return 100000 + new Random().nextInt(900000);
    }

    // Method to check whether all OTPs in the array are unique
    public static boolean areUnique(int[] otps) {
        // Compare each OTP with others
        for (int i = 0; i < otps.length; i++)
            for (int j = i + 1; j < otps.length; j++)
                if (otps[i] == otps[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        // Array to store generated OTPs
        int[] otps = new int[10];

        // Generate and display 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Display uniqueness check result
        System.out.println("All OTPs Unique: " + areUnique(otps));
    }
}
