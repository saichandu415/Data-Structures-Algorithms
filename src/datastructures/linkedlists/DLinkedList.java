package datastructures.linkedlists;

public class DLinkedList {

    public DNode head;
    public DNode tail;
    public int length = 0;

    public DLinkedList(int value) {
        DNode newItem = new DNode(value);
        head = newItem;
        tail = head;
        length++;
    }

    public int[] printList() {
        int[] result = new int[length];
        DNode current = head;
        int i = 0;
        while (current != null) {
            result[i] = current.value;
            current = current.next;
            i++;
        }
        return result;
    }

    public void append(int value) {
        DNode newitem = new DNode(value);
        newitem.previous = head;
        tail.next = newitem;
        tail = newitem;
        length++;
    }

    public void prepend(int value) {
        DNode prependItem = new DNode(value);
        head.previous = prependItem;
        prependItem.next = head;
        head = prependItem;
        length++;
    }

    public void insert(int position, int value) {
        if (position == 0) {
            prepend(value);
        } else if (position == length - 1) {
            append(value);
        } else if (position > 0 && position < length - 1) {
            DNode current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            DNode insertItem = new DNode(value);
            insertItem.next = current.next;
            insertItem.previous = current.next.previous;
            current.next.previous = insertItem;
            current.next = insertItem;
            length++;
        }
    }

    public void remove(int postion) {
        if (postion == 0) {
            head = head.next;
            length--;
        } else if (postion > 0 && postion < length - 1) {
            DNode current = head;
            for (int i = 0; i < postion - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            current.next.previous = current;
            length--;
        } else if (postion == length - 1) {
            DNode current = head;
            for (int i = 0; i < postion - 1; i++) {
                current = current.next;
            }
            current.next = null;
            tail = current;
            length--;
        }
    }

    @Override
    public String toString() {
        return "DLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
