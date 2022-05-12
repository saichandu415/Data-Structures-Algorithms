package datastructures.linkedlists;

import java.util.Arrays;

public class TestingClass {

    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList(10);
//        linkedList.append(2);
//        linkedList.append(5);
////        linkedList.append(7);
////        linkedList.prepend(3);
//        linkedList.prepend(15);
//        linkedList.insert(1, 9);
//        linkedList.remove(1);
//        System.out.println(linkedList);
//        System.out.println(linkedList.reverse(linkedList));

        DLinkedList linkedList = new DLinkedList(10);
        linkedList.append(11);
        linkedList.append(23);
        linkedList.prepend(30);
        linkedList.insert( 1,44);
        System.out.println(Arrays.toString(linkedList.printList()));
        linkedList.remove(4);
        System.out.println(Arrays.toString(linkedList.printList()));
        linkedList.append(100);
        System.out.println(Arrays.toString(linkedList.printList()));

//        System.out.println(linkedList);
//        System.out.println();
    }
}
