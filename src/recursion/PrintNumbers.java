package recursion;

/**
 * Teaching Example: Print Numbers (Decrease)
 * 
 * Problem Statement:
 * Given a number `N`, print all numbers from `N` down to 1.
 * 
 * Approach:
 * A function calls itself passing `N-1`. This is the basic idea of recursion.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N) call stack space
 */
public class PrintNumbers {

    public static void printDescending(int n) {
        // Base case: Stop when n reaches 0
        if (n == 0) {
            return;
        }
        
        System.out.print(n + " ");
        
        // Recursive step
        printDescending(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing numbers from " + n + " to 1:");
        printDescending(n);
        System.out.println();
    }
}
