package CollectionFrameWork;

import java.util.PriorityQueue;

public class QueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        System.out.println(queue);
        System.out.println( queue.element());
        System.out.println(queue.remove());
        System.out.println(queue);

    }
}
