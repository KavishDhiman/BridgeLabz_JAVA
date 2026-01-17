package oopsprogrammingfundamentals.level2;
/*
 * Problem Statement:
 * Write a Java program to check whether a given string
 * is a palindrome or not.
 */

/*
 * Class Name: PalindromeChecker
 *
 * Description:
 * This class checks whether a given string reads the same
 * forward and backward. It uses character comparison from
 * both ends of the string to determine palindrome property.
 */

// PalindromeChecker class checks if a string is palindrome
public class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reverse = new StringBuilder(text).reverse().toString();
        return text.equals(reverse);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "madam";

        p.displayResult();
    }
}
