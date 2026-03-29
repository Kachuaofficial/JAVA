package patterns;

/**
 * Teaching Example: Print a Number Square
 * 
 * Problem Statement:
 * Given a number of rows N, print a square where every cell contains its column index (or a number).
 * Example for N = 4:
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * 1 2 3 4
 * 
 * Approach:
 * Nested loops. The outer loop controls rows (from 1 to N).
 * The inner loop controls columns and prints the column number `j`.
 * 
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class NumberSquare {
    
    public static void printNumberSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Next Line
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number Square of size " + n + ":");
        printNumberSquare(n);
    }
}
