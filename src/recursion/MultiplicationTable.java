package recursion;

/**
 * Teaching Example: Multiplication Table using Recursion
 * 
 * Problem Statement:
 * Print the multiplication table of a given number `N` up to 10.
 * 
 * Approach:
 * Keep a multiplier `i`. Print `N * i`. If `i == 10`, return. Else call recursively for `i+1`.
 * 
 * Time Complexity: O(1) - runs exactly 10 times
 * Space Complexity: O(1) - exact 10 calls on stack
 */
public class MultiplicationTable {

    public static void printTable(int multiplier, int num) {
        // Base case
        if (multiplier > 10) {
            return;
        }
        
        System.out.println(num + " * " + multiplier + " = " + (num * multiplier));
        
        // Recursive call
        printTable(multiplier + 1, num);
    }

    public static void main(String[] args) {
        int num = 7;
        
        System.out.println("Multiplication Table of " + num + ":");
        printTable(1, num);
    }
}
