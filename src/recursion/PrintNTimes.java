package recursion;

/**
 * Teaching Example: Print N Times
 * 
 * Problem Statement:
 * Print "Hello World" exactly `N` times using recursion.
 * 
 * Approach:
 * Pass a counter `i` and `N` to the recursive function. If `i == N`, return.
 * Otherwise print, and recursively call with `i+1`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N) for recursive call stack
 */
public class PrintNTimes {

    public static void printMessage(int current, int target) {
        // Base case
        if (current == target) {
            System.out.println("Completed!");
            return;
        }

        System.out.println("Hello World (" + (current + 1) + ")");
        
        // Recursive call
        printMessage(current + 1, target);
    }

    public static void main(String[] args) {
        int target = 5; // e.g. run 5 times
        System.out.println("Printing 'Hello World' " + target + " times:");
        
        printMessage(0, target);
    }
}
