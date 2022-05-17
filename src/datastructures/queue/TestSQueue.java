package datastructures.queue;

import java.util.Arrays;

public class TestSQueue {
    public static void main(String[] args) {
        SQueue queue = new SQueue();
        queue.enqueue(19);
        queue.enqueue(20);
        queue.enqueue(21);
        queue.printList();
        queue.dequeue();
        queue.dequeue();
        queue.printList();
        System.out.println(queue.peek());
        queue.printList();
    }
}
