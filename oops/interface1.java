import java.util.Arrays;
import java.util.List;

public class interface1 {

    public static void main(String[] args) {
        

        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);

      

        Integer totalSum = l.stream()
            .filter(n -> n % 2 == 0) //even numbers nikalega
            .map(n -> n * 2) 
            .reduce(0, (sum, elem) -> sum + elem);

        System.out.println("Sum of doubled even numbers: " + totalSum);


    }
}