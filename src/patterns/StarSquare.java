package patterns;

import java.util.Scanner;

/**
 * Teaching Example: Print a Star Square
 * 
 * Problem Statement:
 * Given a number N, print a square of stars of size N x N.
 * 
 * Approach:
 * Use nested loops. The outer loop controls rows, inner loop controls columns.
 * 
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class StarSquare {
    
    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }

    public static void main(String[] args) {
        // Here we use a hardcoded value instead of Scanner for easy testing
        int n = 4; 
        System.out.println("Star Square of size " + n + ":");
        printSquare(n);
    }
}
