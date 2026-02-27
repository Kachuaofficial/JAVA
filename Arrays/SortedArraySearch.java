public class SortedArraySearch {
    public static void main(String[] args) {
        int start = 0;
        int[] arr = {1,2,3,4,6};
        boolean isTargetPresent = false;

        int end = arr.length-1;
        int target = 6;

        while (start <=end) {
            int mid = start + (end - start) /2;

            if(arr[mid] == target) {
                isTargetPresent = true;
                break;

            }
            else if (arr[mid] > target) {
                end = mid-1;

            }
            else{
                start = mid+1;
            }
        }

        System.out.println(isTargetPresent);
    }
}
