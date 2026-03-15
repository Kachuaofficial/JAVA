import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        int[] arr = {1,4,10,2,5,8,3,0,6,2,7,97,5,2,7,4};


        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);

       

        System.out.println(set);
        System.out.println(set.size());
        
        

    }
}
