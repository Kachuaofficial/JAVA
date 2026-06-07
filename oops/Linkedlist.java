import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("hello");
        list.addLast("java");

        list.offer("Spring ");

        System.out.println(list.getLast()); 
        System.out.println(list.getFirst());
        list.removeLast(); 
        System.out.println(list);
    }
}
