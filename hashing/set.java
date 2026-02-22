package hashing;

import java.util.HashSet;

//set hamesha har element ek hi baar ata h;
public class set {
    static void main() {
        HashSet<Integer> set = new HashSet<>();
        set.add(77);
        set.add(24);
        set.add(76);
        set.add(32);
        set.add(44);
        set.add(76);

        System.out.println(set.size());

        System.out.println(set.contains(32));
        set.remove(32);
        System.out.println(set );

        //COOMMIT ADDED
    }
}
