package datastructures.queue;

import java.util.Arrays;

public class TestQueue {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(19);
        queue.enqueue(20);
        queue.enqueue(21);
        System.out.println(Arrays.toString(queue.printList()));
        queue.dequeue();
        System.out.println(Arrays.toString(queue.printList()));
        System.out.println(queue.peek());
        System.out.println(Arrays.toString(queue.printList()));
    }
}
