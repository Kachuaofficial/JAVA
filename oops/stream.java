import java.util.Arrays;
import java.util.List;

public class stream {
    public static void main(String[] args) {
        
    List<Integer> numbers = Arrays.asList(4, 5, 7, 6, 3, 10, 11, 13, 18);
    
    numbers.stream()
    .filter(n -> n % 2 == 0)
    .forEach(n -> System.out.print(n + " "));

    }

    
}
