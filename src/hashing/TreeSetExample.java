package hashing;

import java.util.TreeSet;

/**
 * Teaching Example: Introduction to TreeSet
 * 
 * Concept:
 * A TreeSet is a collection that uses a Tree for storage. 
 * - It contains distinct elements only (no duplicates) like HashSet.
 * - Unlike HashSet, TreeSet maintains elements in SORTED (ascending) order.
 * - It is typically implemented using a Red-Black tree.
 * 
 * Time Complexity: O(log N) for add, remove, and contains.
 * Space Complexity: O(N) to store elements.
 */
public class TreeSetExample {
    
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements to TreeSet
        set.add(88);
        set.add(10);
        set.add(45);
        set.add(10); // Duplicate won't be added

        // Print the TreeSet - Notice that it's sorted!
        System.out.println("TreeSet automatically sorts elements: " + set);
        
        // Find if element exists
        System.out.println("Contains 45? " + set.contains(45));
    }
}
