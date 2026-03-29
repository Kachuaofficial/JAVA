package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Teaching Example: Introduction to HashMap
 * 
 * Concept:
 * A HashMap stores items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
 * One object is used as a key (index) to another object (value).
 * 
 * Time Complexity: O(1) on average for get() and put() operations.
 * Space Complexity: O(N) to store key-value pairs.
 */
public class BasicHashMap {
    
    public static void main(String[] args) {
        // Create a HashMap object called students where key is String (Name) and value is Integer (Marks)
        Map<String, Integer> students = new HashMap<>();

        // Add keys and values (Name, Marks)
        students.put("Shivam", 98);
        students.put("Vivek", 32);
        
        System.out.println("Students map: " + students);
        
        // Access a value by key
        String searchKey = "Shivam";
        if (students.containsKey(searchKey)) {
            System.out.println(searchKey + "'s marks: " + students.get(searchKey));
        }
    }
}
