public class FirstAndLastOccurence {

    // BruteForce Approach
    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 2, 2, 3, 4 };

    // int target = 2;

    // int firstOccurence = 0;
    // int lastOccurence = 0;

    // for (int i = 0; i < arr.length -1; i++) {
    // if (arr[i] == target) {

    // firstOccurence = i;
    // break;
    // }
    // }

    // for (int i = arr.length - 1; i > 0; i--) {
    // if (arr[i] == target) {
    // lastOccurence = i;
    // break;
    // }
    // }

    // System.out.println(firstOccurence);
    // System.out.println(lastOccurence);

    // }


    public static int  firstOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        int ans = -1;

        while (start <=end) {
            int mid = start + (end - start)/2;
            if (arr[mid]==target) {

                ans= mid;
                end = mid-1;
                
                
            }
            else if (arr[mid] < target) {
                start = mid+1;
                
            }
            else{
                end = mid-1;

            }
            
        }

        return ans;
        
    }


    public static int  lastOccurence(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        int ans = -1;

        while (start <=end) {
            int mid = start + (end - start)/2;
            if (arr[mid]==target) {

                ans= mid;
                start = mid+1;
                
                
            }
            else if (arr[mid] < target) {
                start = mid+1;
                
            }
            else{
                end = mid-1;

            }
            
        }

        return ans;
        
    }
    public static void main(String[] args) {
        // Optimized Approach
        int[] arr = { 1, 2, 2, 2, 3, 4 };

        int target = 2;
        

        System.out.println(firstOccurence(arr, target));
        System.out.println(lastOccurence(arr, target));
    }
}
