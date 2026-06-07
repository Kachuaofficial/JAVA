package arrays;

public class LinearSearch {

    static int idx(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };

        int target = 10;
        int index= idx(arr, target);

        if (index == -1) {
            System.out.println("Index not found");
        } else {
            System.out.println("Index found at " + index);
        }

    }

}
