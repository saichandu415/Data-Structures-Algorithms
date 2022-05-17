package datastructures.stack;

import java.util.Arrays;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(Arrays.toString(stack.printList()));
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(Arrays.toString(stack.printList()));
        System.out.println(stack.getLastElement());
    }
}
