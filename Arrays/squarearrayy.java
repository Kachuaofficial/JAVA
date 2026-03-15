import java.util.ArrayList;

public class squarearrayy {

    public static void main(String[] args) {
        int arr[] = { -6, -2, 1, 4, 6, 8 };
        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();

        int start = 0;

        while (start < arr.length) {

            if (arr[start] < 0) {
                nums1.add(arr[start]);
            } else {
                nums2.add(arr[start]);
            }

            start++;

        }

        start = 0;
        int end = nums1.size() - 1;

        while (start < end) {

            int temp = nums1.get(start);
            nums1.set(start, nums1.get(end));
            nums1.set(end, temp);
            start++;
            end--;

        }

        start = 0;
        end = 0;

        while (start < nums1.size()) {
            nums1.set(start, nums1.get(start) * nums1.get(start));
            start++;
        }
        start = 0;

        while (start < nums2.size()) {
            nums2.set(start, nums2.get(start) * nums2.get(start));
            start++;
        }

        start = 0;
        end = 0;
        int k = 0;

        while (start < nums1.size() && end < nums2.size()) {
            if (nums1.get(start) <= nums2.get(end)) {
                arr[k] = nums1.get(start);
                k++;
                start++;

            } else {
                arr[k] = nums2.get(end);
                k++;
                end++;
            }

        }

        while (end < nums2.size()) {
            arr[k] = nums2.get(end);
            k++;
            end++;

        }

        while (start < nums1.size()) {
            arr[k] = nums1.get(start);
            k++;
            start++;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
     

    }
}
