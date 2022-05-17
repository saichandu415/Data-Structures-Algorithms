package datastructures.stack;

import datastructures.linkedlists.Node;

public class Stack {

    public Node top;
    public Node bottom;
    public int length;

    public Stack() {

    }

    public void push(int value){
        Node stackItem = new Node(value);
        if (length == 0){
            top = stackItem;
            bottom = stackItem;
        }else{
            stackItem.next = top;
            top = stackItem;
        }
        length++;
    }

    public int peek(){
        return top.value;
    }

    public Node pop(){
        Node topValue = new Node(top.value);
        top = top.next;
        if(length == 1){
            bottom = null;
        }
        length--;

        return topValue;
    }

    public int getLastElement(){
        return bottom.value;
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
