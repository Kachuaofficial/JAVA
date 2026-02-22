package strings;

import java.util.Scanner;

public class pass_string_to_method {
    static void main() {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        String showName = tellName(name);
        System.out.println(showName);


    }

    static String tellName(String name) {
        return name;
    }
}
