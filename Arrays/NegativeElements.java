public class NegativeElements {
    static void main(String[] args) {
        int[] arr = {1,6,-1,-6,-8, 5 , 9};

        for(int n:arr) {
            if (n < 0) {
                System.out.println(n);
            }
        }
    }
}
