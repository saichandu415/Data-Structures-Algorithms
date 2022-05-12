package datastructures.linkedlists;

public class DNode {
    int value;
    DNode next;
    DNode previous;

    public DNode(int value) {
        this.value = value;
    }

    public DNode(int value, DNode next, DNode previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "DNode{" +
                "value=" + value +
                '}';
    }
}
