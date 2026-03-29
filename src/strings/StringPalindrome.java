package strings;

/**
 * Teaching Example: String Palindrome
 * 
 * Problem Statement:
 * Given a string, check to see if it reads the same backwards as it does forwards.
 * 
 * Approach:
 * Two Pointers. Use a `start` pointer at index 0 and an `end` pointer at length-1.
 * Compare characters. If mismatch, return false. Otherwise, move pointers inward.
 * 
 * Time Complexity: O(N) where N is length of string.
 * Space Complexity: O(1)
 */
public class StringPalindrome {
    
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        String test1 = "radar";
        String test2 = "hello";

        System.out.println("Is '" + test1 + "' a palindrome? " + isPalindrome(test1));
        System.out.println("Is '" + test2 + "' a palindrome? " + isPalindrome(test2));
    }
}
