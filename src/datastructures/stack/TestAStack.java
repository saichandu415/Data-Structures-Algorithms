package datastructures.stack;

public class TestAStack {
    public static void main(String[] args) {
        AStack stack = new AStack();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack.values);

        stack.pop();
        System.out.println(stack.values);


        System.out.println(stack.peek());

        int lastElement = stack.getLastElement();
        System.out.println(lastElement);
    }
}
