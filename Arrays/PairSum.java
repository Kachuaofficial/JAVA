package Arrays;

import java.util.ArrayList;

public class PairSum {

    static ArrayList<Integer> pairSum(int[] nums, int target){
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;

        int start = 0;
        int end = nums.length-1;

        while (start <end) {
            if (nums[start] + nums[end] == target){
                ans.add(start);
                ans.add(end);
                return ans;
            } else if (nums[start]+nums[end] > target) {
                end--;

            } else  {
                start++;
            }
        }

        return ans;
    }
    static void main() {

        int[] arr = {2,7,11,15};
        int target = 9;
        ArrayList<Integer> ans = pairSum(arr,  target);

        System.out.println(ans);
    }
}
