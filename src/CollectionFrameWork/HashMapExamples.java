package CollectionFrameWork;

import java.util.HashMap;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(2,"2");
        //will override first key 2
        map.put(null,"null");
        //map allows 1 null key
        System.out.println(map);
    }
}
