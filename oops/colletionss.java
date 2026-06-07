import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class colletionss {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("first");
        collection.add("second");
        collection.add("third");

        Iterator<String> itr = collection.iterator();
        String element = null;

        System.out.println("Traversing");

        while (itr.hasNext()) {
            element = itr.next();
            System.out.println(element);


            if (element == "third") {
                itr.remove();
            }
        }

        System.out.println(collection);
    }
}
