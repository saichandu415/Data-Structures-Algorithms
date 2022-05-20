package datastructures.trees;

public class TestTrees {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(9);
        binarySearchTree.insert(4);
//        binarySearchTree.insert(20);
        binarySearchTree.insert(1);
        binarySearchTree.insert(6);
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);
        binarySearchTree.insert(8);
//        binarySearchTree.insert(15);
//        binarySearchTree.insert(120);
//        binarySearchTree.insert(170);
//        binarySearchTree.insert(110);
//        binarySearchTree.insert(115);
//        binarySearchTree.insert(119);
//        binarySearchTree.insert(117);
//        binarySearchTree.insert(116);
//        binarySearchTree.insert(6);
//        System.out.println(binarySearchTree.lookup(9));
//        System.out.println(binarySearchTree.lookup(15));
//        System.out.println(binarySearchTree.lookup(179));

        binarySearchTree.remove(9);
        System.out.println(binarySearchTree.lookup(15));
    }
}
