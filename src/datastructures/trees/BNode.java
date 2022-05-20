package datastructures.trees;

public class BNode {

    public int value;
    public BNode left;
    public BNode right;

    public BNode(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "value=" + value ;
    }
}
