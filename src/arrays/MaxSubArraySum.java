package arrays;

public class MaxSubArraySum {

    public static void main(String[] args) {
        
        int arr[] = {2,4,6,8};
        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                for (int k = i; k <=j; k++) {
                    
                    // System.out.print(arr[k] + " ");
                    currentSum +=arr[k];

                    
                    
                    
                }
                System.out.print(currentSum + " ");
                if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
            }
            System.out.println();
        }

        System.out.println(maxSum);
    }
}