public class SumOfElements {
    static void main() {
        int[] arr = {0,0,6,8,3};
        int sum = 0;

        for (int n:arr) {
            sum+=n;
        }

        System.out.println(sum);
    }
}
