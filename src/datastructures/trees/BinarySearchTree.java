package datastructures.trees;

public class BinarySearchTree {
    BNode root;

    public BinarySearchTree() {

    }

    public void insert(int value) {
        BNode newEle = new BNode(value);
        if (root == null)
            root = newEle;
        else {
            BNode current = root;
            while (true) {
                if (value > current.value) {
                    if (current.right == null) {
                        current.right = newEle;
                        break;
                    } else
                        current = current.right;
                } else if (value < current.value) {
                    if (current.left == null) {
                        current.left = newEle;
                        break;
                    } else
                        current = current.left;
                }
            }
        }
    }

    public boolean lookup(int value) {
        BNode current = root;
        while (current != null) {
            if (value > current.value)
                current = current.right;
            else if (value < current.value)
                current = current.left;
            else
                return true;
        }
        return false;
    }

    public void remove(int value) {

        BNode current = root;
        BNode parent = null;

        while (current != null) {
            if (value > current.value) {
                parent = current;
                current = current.right;
            } else if (value < current.value) {
                parent = current;
                current = current.left;
            } else {
                break;
            }
        }

        if (current.right == null && current.left == null) {
            if (parent.left != null)
                parent.left = null;
            else
                parent.right = null;
        }else if (current.right != null){
            if(current.right.left == null)
                parent.right = current.right;
            else {
                BNode replacementNode = current.right.left;
                BNode replacementNodeParent = current.right;
                while(replacementNode.left != null){
                    replacementNodeParent = replacementNode;
                    replacementNode = replacementNode.left;
                }
                current.value = replacementNode.value;
                replacementNodeParent.left = replacementNode.right;
            }
        }else if(current.left != null){
            if(current.left.right == null)
                parent.left = current.left;
            else{
                BNode replacementNode = current.left.right;
                BNode replacementNodeParent = current.left;
                while(replacementNode.right != null){
                    replacementNodeParent = replacementNode;
                    replacementNode = replacementNode.right;
                }
                current.value = replacementNode.value;
                replacementNodeParent.right = replacementNode.left;
            }
        }
    }

}
