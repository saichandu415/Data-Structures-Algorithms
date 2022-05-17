package datastructures.queue;

import datastructures.stack.Stack;

import java.util.Arrays;

public class SQueue {

    Stack stack = new Stack();
    Stack revStack = new Stack();

    public void enqueue(int value){
        if (stack.length == 0){
            stack.push(value);
        }else{
            while (stack.length != 0){
                this.revStack.push(this.stack.pop().value);
            }
            this.stack.push(value);
            while(revStack.length != 0){
                this.stack.push(this.revStack.pop().value);
            }
        }
    }

    public int peek(){
        int peekVal= stack.peek();
        return peekVal;
    }

    public void dequeue(){
        this.stack.pop();
    }

    public void printList(){
        System.out.println(Arrays.toString(this.stack.printList()));;
    }

}
