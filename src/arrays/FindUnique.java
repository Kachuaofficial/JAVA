package arrays;

/**
 * Teaching Example: Find Unique Element (Single Number)
 * 
 * Problem Statement:
 * Given an array of integers where every element appears exactly twice except
 * for one element which appears only once. Find that single one.
 * 
 * Approach (Bit Manipulation):
 * We can use the XOR bitwise operator approach.
 * Important XOR rules:
 * 1. a ^ a = 0 (XOR of same numbers is 0)
 * 2. a ^ 0 = a (XOR with 0 is the number itself)
 * Therefore, if we XOR all elements, pairs will cancel out and only unique remains.
 * 
 * Time Complexity: O(N) where N is array length.
 * Space Complexity: O(1)
 */
public class FindUnique {
    
    public static int findSingleNumber(int[] arr) {
        int unique = 0;
        
        for (int n : arr) {
            unique ^= n; // unique = unique ^ n
        }
        
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 4, 9, 6, 2};
        
        System.out.println("The unique single number is: " + findSingleNumber(arr));
    }
}
