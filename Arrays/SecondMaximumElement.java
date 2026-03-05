public class SecondMaximumElement {
    static void main() {
        int[] arr = {1,6,-1,-6,-8, 5 , 9};
        int max = Integer.MIN_VALUE;
        int SecondMax = 0;

        for (int n:arr) {
            if (n> max){
                SecondMax = max;
                max = n;


            } else if (n>SecondMax && n!=max){
                SecondMax = n;
            }


        }



        System.out.println(max);
        System.out.println(SecondMax);


    }
}
