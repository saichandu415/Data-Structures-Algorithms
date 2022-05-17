package datastructures.queue;

import datastructures.linkedlists.Node;

public class Queue {

    Node top;
    Node last;
    int length;

    public Queue(){

    }

    public int peek(){
        return top.value;
    }

    public void enqueue(int value){
        Node newItem = new Node(value);
        if (length == 0){
            top = newItem;
            last = newItem;
        }else {
            last.next = newItem;
            last = newItem;
        }
        length++;
    }

    public int dequeue(){
        int value = top.value;
        top = top.next;
        if(length == 1)
            last = null;
        length--;
        return value;
    }

    public int[] printList(){
        int[] result = new int[length];
        Node head = top;
        int i = 0;
        while(head != null){
            result[i] = head.value;
            head = head.next;
            i++;
        }
        return result;
    }




}
