package strings;

/**
 * Teaching Example: Basic String Operations
 * 
 * Concept:
 * A String in Java is an object that represents a sequence of characters.
 * Useful methods include:
 * - length(): returns number of characters
 * - charAt(index): returns the character at the specified index
 * 
 * Time Complexity: O(1) for length and charAt.
 * Space Complexity: O(1)
 */
public class BasicString {
    
    public static void main(String[] args) {
        String message = "Hello, this is a string";

        System.out.println("Original String: " + message);
        System.out.println("Length of String: " + message.length());
        
        // Accessing character at index 2 (0-based indexing)
        System.out.println("Character at index 2: " + message.charAt(2));
    }
}
