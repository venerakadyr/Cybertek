package CollectionFrameWork;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        //insertion order
        //not duplicated but ordered by order of inserting
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("a");
//        set.add("a");
        set.add("b");
        set.add(null);
        set.add("2");
        System.out.println(set);
//      [a, b, null, 2]
    }
}
