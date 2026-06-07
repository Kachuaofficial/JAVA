
interface Calculator {

    static int add(int a, int b) {
        return a+b;
    }

    static int multiply(int a, int b) {
        return a*b;
    }


    default void greet() {
        System.out.println("welcome to calculator");
    }
}
public class static1 {
    public static void main(String[] args) {
        System.out.println(Calculator.add(10, 20));
        System.out.println(Calculator.multiply(10, 20));

        Calculator obj = new Calculator() {
            
        };

        obj.greet();
    }
}
