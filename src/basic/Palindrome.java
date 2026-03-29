package basic;

/**
 * Teaching Example: Check if a Number is a Palindrome
 * 
 * Problem Statement:
 * Given a number N, check if it reads the same backward as forward.
 * 
 * Approach:
 * Reverse the number and check if the reversed number is equal to the original number.
 * 
 * Time Complexity: O(log10(N)) - We iterate once through the digits of the number.
 * Space Complexity: O(1) - Only integer variables are used.
 */
public class Palindrome {
    
    public static void main(String[] args) {
        int num = 2552;
        int revNumber = 0;
        int original = num;

        // Step 1: Reverse the number
        while (num > 0) {
            int lastDigit = num % 10;
            revNumber = (revNumber * 10) + lastDigit;
            num = num / 10;
        }

        // Step 2: Compare the reversed number with the original number
        if (original == revNumber) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is not a Palindrome number.");
        }
    }
}
