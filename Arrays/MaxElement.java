public class MaxElement {
    static void main(String[] args) {
        int[] arr = {1, 6, -1, -6, -8, 5, 9};

        System.out.println(maxNumber(arr));
    }

    public static int maxNumber(int[] num) {

        int max = Integer.MIN_VALUE;
        for (int n : num) {
            if (n > max) max = n;
        }

        return max;
    }
}
