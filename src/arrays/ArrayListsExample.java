package arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Teaching Example: Introduction to ArrayLists
 * 
 * Problem Statement:
 * Demonstrate how to create an ArrayList, add elements, and reverse it.
 * 
 * Time Complexity: O(N) to reverse the ArrayList.
 * Space Complexity: O(N) where N is the number of elements.
 */
public class ArrayListsExample {
    
    public static void main(String[] args) {
        // Initialize an ArrayList of Integers
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Add elements to the ArrayList
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println("Original ArrayList: " + arr);

        // Reverse the ArrayList using Collections utility class
        Collections.reverse(arr);

        System.out.println("Reversed ArrayList: " + arr);
    }
}
