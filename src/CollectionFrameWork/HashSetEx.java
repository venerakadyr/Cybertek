package CollectionFrameWork;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {

        //no duplicate, not index, no order
        HashSet<String> set=new HashSet<>();
        set.add("a");
//        set.add("a");
        set.add("b");
        set.add(null);
        set.add("2");
        System.out.println(set);
//      [null, a, b, 2]
    }
}
