package Arrays;

public class subarray {
    public static int maxSubArray(int[] arr) {

        int max_sum = arr[0];
        int currentSum = 0;

        for (int sum : arr) {

            currentSum += sum;
            max_sum = Math.max(currentSum, max_sum);

            if (currentSum < 0) {
                currentSum = 0;
            }

        }

        return max_sum;
    }


    static void main() {

        int[] arr = {1, 2, 3, 5, 6};

        System.out.println(maxSubArray(arr));
    }

}
