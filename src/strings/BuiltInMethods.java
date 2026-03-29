package strings;

/**
 * Teaching Example: Built-in String Datatype Methods
 * 
 * Concept:
 * Java Strings have many built-in methods. Here are some of the most common ones.
 * - toLowerCase() / toUpperCase(): Changes casing
 * - trim(): Removes leading and trailing whitespaces
 * - substring(start, end): Extracts a portion of the string
 * - replace(old, new): Replaces occurrences of a character
 * - split(regex): Splits string by regex matching
 * 
 * Note: Java Strings are IMMUTABLE. Calling these methods returns a new String and
 * does not modify the original string.
 */
public class BuiltInMethods {
    
    public static void main(String[] args) {
        String original = "   Hello Java Students!   ";
        System.out.println("Original: '" + original + "'");

        // 1. Trim
        String trimmed = original.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // 2. ToUpperCase & ToLowerCase
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // 3. Substring
        String language = trimmed.substring(6, 10);
        System.out.println("Substring (6 to 10): " + language);

        // 4. Replace
        String replaced = trimmed.replace('a', '@');
        System.out.println("Replaced 'a' with '@': " + replaced);

        // 5. Split
        String data = "apple,banana,orange";
        String[] fruits = data.split(",");
        
        System.out.println("\nSplit string '" + data + "':");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
