package hashing;

import java.util.HashSet;

/**
 * Teaching Example: Introduction to HashSet
 * 
 * Concept:
 * A HashSet is a collection that uses a hash table for storage.
 * - It does NOT allow duplicate values ("har element ek hi baar aata hai").
 * - It does NOT guarantee order of iteration (insertion order is not maintained).
 * 
 * Time Complexity: O(1) on average for add, remove, and contains.
 * Space Complexity: O(N) to store elements.
 */
public class HashSetExample {
    
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements
        set.add(77);
        set.add(24);
        set.add(76);
        set.add(32);
        set.add(44);
        set.add(76); // Duplicate, will not be added

        System.out.println("HashSet elements (no guaranteed order): " + set);
        System.out.println("Total unique elements (size): " + set.size());

        // Check if an element exists
        System.out.println("Does set contain 32? " + set.contains(32));
        
        // Remove an element
        set.remove(32);
        System.out.println("Set after removing 32: " + set);
        System.out.println("Does set contain 32 now? " + set.contains(32));
    }
}
