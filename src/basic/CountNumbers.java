package basic;

/**
 * Teaching Example: Count Digits in a Number
 * 
 * Problem Statement:
 * Given a number N, find out how many digits it contains.
 * 
 * Approach:
 * We can use logarithm base 10 to find the number of digits in O(1) time.
 * Number of digits = floor(log10(N)) + 1
 * 
 * Time Complexity: O(1) - logarithmic operation takes constant time.
 * Space Complexity: O(1) - no extra space used.
 */
public class CountNumbers {
    
    public static void main(String[] args) {
        int num = 345;

        if (num > 0) {
            // Using logarithmic method for O(1) time complexity
            int count = (int) Math.log10(num) + 1;
            System.out.println("Number of digits in " + num + " is: " + count);
        } else if (num == 0) {
            System.out.println("Number of digits in 0 is: 1");
        } else {
            // For negative numbers, make it positive first or adjust logic
            int count = (int) Math.log10(Math.abs(num)) + 1;
            System.out.println("Number of digits in " + num + " is: " + count);
        }
    }
}
