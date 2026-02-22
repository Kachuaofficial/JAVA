package hashing;

import java.util.HashSet;

public class find_distinct_elements {
    public static void main(String[] args) {
        int[] arr = {4,67,1,7,4,2};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        
        System.out.println(set.size());
    }
}
