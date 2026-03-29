package recursion;

/**
 * Teaching Example: Factorial Using Recursion
 * 
 * Problem Statement:
 * Calculate the factorial of a given number `N`. (N! = N * (N-1) * (N-2) * ... * 1)
 * 
 * Approach:
 * Using recursion: fact(n) = n * fact(n-1)
 * Base case: if n == 0, return 1.
 * 
 * Time Complexity: O(N) since we make N recursive calls.
 * Space Complexity: O(N) due to the call stack.
 */
public class Factorial {

    public static int getFactorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 6;
        
        System.out.println("The factorial of " + num + " is: " + getFactorial(num));
    }
}
