import java.util.Arrays;

public class ReverseArray {

    static void main() {

        int[] arr = {3,5,62,6,2};

        int start = 0;
        int end = arr.length-1;


        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
