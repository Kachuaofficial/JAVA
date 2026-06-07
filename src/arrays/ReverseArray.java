package arrays;

public class ReverseArray {

    static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        // Code to reverse an array

        int[] arr = { 1, 5, 6, 8, 2 };

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}