package strings;

/**
 * Teaching Example: Print All Substrings
 * 
 * Problem Statement:
 * Given a string, print all logical contiguous substrings possible using loops.
 * 
 * Approach:
 * Use two loops. The outer loop selects the starting character. The inner loop
 * selects the ending character. We can use `String.substring(start, end)` to
 * get the substring in Java.
 * 
 * Time Complexity: O(N^3) (due to substring concatenation/copy which is O(N) inside O(N^2) loops).
 * Space Complexity: O(N) to store current substring in memory.
 */
public class PrintSubstrings {

    public static void printAllSubstrings(String str) {
        if (str == null || str.isEmpty()) return;

        int n = str.length();

        for (int start = 0; start < n; start++) {
            for (int end = start + 1; end <= n; end++) {
                // substring(start, end) excludes character at 'end' index
                String sub = str.substring(start, end);
                System.out.println(sub);
            }
        }
    }

    public static void main(String[] args) {
        String testString = "abcd";
        
        System.out.println("All substrings of '" + testString + "':");
        printAllSubstrings(testString);
    }
}
