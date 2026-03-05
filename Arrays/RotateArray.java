import java.util.Arrays;

public class RotateArray {

    static void main() {
        int[] arr = {1,5,6,7,9,2,6,4};
        int n = arr.length;

        int idx = 20;
        idx %= n;
        rotate(arr, 0,idx-1 );
        rotate(arr, idx,n-1);
        rotate(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));


    }


    public  static  void rotate(int[] arr, int i, int j) {
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
