package CollectionFrameWork;

import java.util.ArrayDeque;

public class ArrayDequeEX {
    public static void main(String[] args) {
        ArrayDeque<String> deque=new ArrayDeque<>();
        deque.add("a");
        deque.add("b");
        deque.add("c");
        System.out.println(deque);

        //[a, b, c]

        System.out.println(deque.peek());
        //a --> check first

        System.out.println(deque.peekLast());
        //c --check lasrt

        deque.addFirst("2");
        deque.addLast("3");
        System.out.println(deque);
    }
}
