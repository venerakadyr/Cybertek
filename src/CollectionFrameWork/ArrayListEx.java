package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String [] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add(null);
        System.out.println(list);
        String newStr=list.get(2);
        int index=list.indexOf("a");

        System.out.println(newStr);
        System.out.println(index);

        //[a, b, c, null]
        //Arraylist accept null, duplicates, not sorted, with index
    }

}
