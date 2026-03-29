package patterns;

/**
 * Teaching Example: Number Triangle
 * 
 * Problem Statement:
 * Print a right-angled triangle filled with continuous numbers.
 * Example for N = 3:
 * 1
 * 2 3
 * 4 5 6
 * 
 * Approach:
 * Keep a counter variable. Outer loop tracks rows from 1 to N, inner loop 
 * prints the counter and increments it exactly `row` times.
 * 
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class NumberTriangle {
    
    public static void printNumberTriangle(int rows) {
        int num = 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 4;
        System.out.println("Number Triangle of size " + rows + ":");
        printNumberTriangle(rows);
    }
}
