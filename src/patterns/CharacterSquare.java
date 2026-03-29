package patterns;

/**
 * Teaching Example: Print a Character Square
 * 
 * Problem Statement:
 * Print a square of incrementing characters (e.g. A, B, C...) based on board size.
 * 
 * Approach:
 * Use a character variable starting from 'A'. Output it and then increment the
 * character variable `ch++` inside the nested loops.
 * 
 * Time Complexity: O(N^2) where N is size of square.
 * Space Complexity: O(1)
 */
public class CharacterSquare {

    public static void printCharacterSquare(int size) {
        char ch = 'A';
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ch + " ");
                ch++; // Increment to next ASCII character
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Character Square of size " + n + ":");
        printCharacterSquare(n);
    }
}
