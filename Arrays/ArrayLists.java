import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    static void main() {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        Collections.reverse(arr);

        System.out.println(arr);
    }
}
