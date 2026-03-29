package strings;

/**
 * Teaching Example: Count Vowels in a String
 * 
 * Problem Statement:
 * Given a string, count the total number of vowels (a, e, i, o, u) present in it.
 * 
 * Approach:
 * Iterate through the string using a loop. At each index, get the character
 * and check if it is a vowel. Maintain a count.
 * 
 * Time Complexity: O(N) where N is length of string.
 * Space Complexity: O(1)
 */
public class CountVowels {

    public static int getVowelCount(String str) {
        if (str == null) return 0;
        
        int count = 0;
        str = str.toLowerCase(); // To handle uppercase characters easily

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String testString = "Education is important";
        
        System.out.println("String: " + testString);
        System.out.println("Number of vowels: " + getVowelCount(testString));
    }
}
