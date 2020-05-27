package CollectionFrameWork;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        //Linkedlist  implements from LIST interface allows duplicate, not sorted, you can reach from beginning and last

       LinkedList<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add(null);
        //[a, b, b, null]
        //Linkedlist has implementation from DEQUE INTERFACE so you can add from beginning and ending
        list.addFirst("aa");
        list.addLast("cc");
        System.out.println(list);
//        [aa, a, b, b, null, cc]


        list.removeFirst();
        list.removeLast();
        System.out.println(list);
//        [a, b, b, null]



    }
}
