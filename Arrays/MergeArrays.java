import java.util.ArrayList;

public class MergeArrays {
    static void main() {

        int[] arr = {1,2,3,4};
        int[] arr2 = {6,8,9, 20};
        int arrayLength =arr.length + arr2.length;
        int[] merged = new int[arrayLength];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr.length && j < arr2.length) {
            if (arr[i] <= arr2[j]) {
                merged[k] = arr[i];
                k++;
                i++;

                
            } else {
                merged[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (j < arr2.length) {
            merged[k] = arr2[j];
                k++;
                j++;
        }

        while (i < arr.length) {
            merged[k] = arr[i];
                k++;
                i++;
        }
        for (int k2 = 0; k2 < merged.length; k2++) {
            System.out.println(merged[k2]);
        }


    }
}
