import java.util.function.Function;

public class MethodRefrence {
    static Integer convert(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        
        Function<String, Integer> f1 = MethodRefrence::convert;
        System.out.println(f1.apply("123"));
    }
}
