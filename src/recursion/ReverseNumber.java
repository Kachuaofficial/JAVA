package recursion;

/**
 * Teaching Example: Reverse a Number using Recursion
 * 
 * Problem Statement:
 * Reverse the digits of a given number `N` using recursion.
 * 
 * Approach:
 * Extract the last digit and append it to `rev`. Recursively call the function
 * passing `N/10` and the new `rev`.
 * 
 * Time Complexity: O(log N) -> number of digits
 * Space Complexity: O(log N) -> recursive call stack
 */
public class ReverseNumber {

    private static int reverseHelper(int n, int rev) {
        // Base case: no more digits left
        if (n == 0) {
            return rev;
        }
        
        int lastDigit = n % 10;
        rev = (rev * 10) + lastDigit;
        
        // Recursive call
        return reverseHelper(n / 10, rev);
    }
    
    public static int reverseDigits(int n) {
        return reverseHelper(n, 0);
    }

    public static void main(String[] args) {
        int n = 932;
        
        System.out.println("Original number: " + n);
        System.out.println("Reversed number: " + reverseDigits(n));
    }
}
