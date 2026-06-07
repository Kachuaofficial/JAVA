import java.util.function.Function; //

class StringHelper {
    // Static method
    static Integer convertToInt(String str) {
        return Integer.parseInt(str); //
    }
    
    // Instance method
    String convertToUpper(String str) {
        return str.toUpperCase(); //
    }
}

class Person {
    private String name; //
    public Person(String name) { this.name = name; } // Constructor
    public String getName() { return name; } //
}

public class MethodRefExam {
    public static void main(String[] args) {
        // 1. Static Method Reference
        Function<String, Integer> staticRef = StringHelper::convertToInt;
        System.out.println(staticRef.apply("123")); // Output: 123

        // 2. Instance Method Reference (Specific Object)
        StringHelper helperObj = new StringHelper(); //
        Function<String, String> instanceRef = helperObj::convertToUpper;
        System.out.println(instanceRef.apply("hello")); // Output: HELLO

        // 3. Constructor Reference
        Function<String, Person> personFactory = Person::new; //
        Person p = personFactory.apply("Ajay"); // Creates new Person object
        System.out.println(p.getName()); // Output: Ajay
    }
}