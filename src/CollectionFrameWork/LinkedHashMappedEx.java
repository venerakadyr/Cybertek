package CollectionFrameWork;

import java.util.LinkedHashMap;

public class LinkedHashMappedEx {
    public static void main(String[] args) {
        //insecertion order
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"one");
        map.put(3,"three");

        map.put(2,"two");
        map.put(null, "null");
        System.out.println(map);

    }
}
