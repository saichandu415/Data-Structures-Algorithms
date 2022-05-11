package datastructures.linkedlists;

import java.util.Arrays;

public class LinkedList {


    private Node head;
    private Node tail;
    public int length = 0;

    public LinkedList(int value, Node node) {
        this.head = new Node(value, node);
        this.tail = this.head;
        this.length++;
    }

    public LinkedList(int value) {
        this(value, null);
    }

    public LinkedList() {
        this(0, null);
    }

    public void append(int value) {
        Node newNode = new Node(value, null);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        head = new Node(value, head);
        length++;
    }

    public void insert(int index, int value) {
        if (index == 0) {
            append(value);
        } else if (index == length - 1) {
            prepend(value);
        } else if (index > 0 && index < length - 1) {
            Node indexedPos = head;
            while (index != 1) {
                indexedPos = indexedPos.next;
                index--;
            }
            Node newNode = new Node(value, null);
            newNode.next = indexedPos.next;
            indexedPos.next = newNode;
            length++;
        }
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
            length--;
        } else {
            Node current = head;
            int i = 0;
            for (i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            length--;
            if (i == length - 1)
                tail = current;
        }
    }

    public int[] printValues(){
        int[] values = new int[length];
        Node current = this.head;
        int i = 0;
        while (current != null){
            values[i] = current.value;
            current = current.next;
            i++;
        }
        return values;
    }

    public LinkedList reverse(LinkedList linkedList){

        LinkedList reversedList =  new LinkedList(linkedList.head.value);
        Node current = linkedList.head;
        while (current.next != null){
            current = current.next;
            Node newNode = new Node(current.value);
            newNode.next = reversedList.head;
            reversedList.head = newNode;
            reversedList.length++;
        }
        return reversedList;
    }

    @Override
    public String toString() {
//        return head.toString();
        return Arrays.toString(printValues());
    }
}
