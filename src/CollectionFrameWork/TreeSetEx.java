package CollectionFrameWork;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        //natural order
        //no allowed NULL, not duplicates, sorted by ASCII table
        TreeSet<String> set=new TreeSet<>();
        set.add("a");
//        set.add("a");
        set.add("b");
//        set.add(null);
        set.add("2");
        set.add("/");
        set.add("4");
        set.add("Y");
        System.out.println(set);
//        [/, 2, 4, Y, a, b]
    }
}
