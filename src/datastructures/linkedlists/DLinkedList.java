package datastructures.linkedlists;

public class DLinkedList {

    public DNode head;
    public DNode tail;
    public int length = 0;

    public DLinkedList(int value){
        DNode newItem = new DNode(value);
        head = newItem;
        tail = head;
        length++;
    }

    public int[] printList(){
        int[] result = new int[length];
        DNode current = head;
        int i = 0;
        while(current!= null){
            result[i] = current.value;
            current = current.next;
            i++;
        }
        return result;
    }

}
