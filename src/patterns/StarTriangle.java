package patterns;

/**
 * Teaching Example: Print a Star Triangle
 * 
 * Problem Statement:
 * Given a number of rows N, print a right-angled triangle pattern using stars.
 * Example for N = 4:
 * *
 * * *
 * * * *
 * * * * *
 * 
 * Approach:
 * Nested loops. The outer loop controls rows (from 1 to N).
 * The inner loop controls columns and runs up to the current row number.
 * 
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class StarTriangle {
    
    public static void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Next Line
        }
    }

    public static void main(String[] args) {
        int rows = 4;
        System.out.println("Star Triangle of size " + rows + ":");
        printTriangle(rows);
    }
}
