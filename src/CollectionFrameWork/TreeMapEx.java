package CollectionFrameWork;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        //no null, sorted
        TreeMap<Integer,String> map=new TreeMap<>();

        map.put(1,"one");
        map.put(3,"three");

        map.put(2,"two");
//        map.put(null, "null");
        System.out.println(map);
    }
}
