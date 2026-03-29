package basic;

/**
 * Teaching Example: Reverse a Number
 * 
 * Problem Statement:
 * Given a number N, reverse its digits and return the reversed number.
 * 
 * Time Complexity: O(log10(N)) - We divide the number by 10 in each step.
 * Space Complexity: O(1) - Only a few variables are used.
 */
public class ReverseNumber {

    /**
     * Reverses the given non-negative integer.
     * 
     * @param n the number to reverse
     * @return the reversed number
     */
    public static int reverse(int n) {
        int revNum = 0;
        
        while (n > 0) {
            int lastDigit = n % 10;                // Extract the last digit
            revNum = (revNum * 10) + lastDigit;    // Append it to the reversed number tracking variable
            n = n / 10;                            // Remove the last digit from original number
        }

        return revNum;
    }

    public static void main(String[] args) {
        int num = 456;
        int myNum = reverse(num);
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + myNum);
    }
}
