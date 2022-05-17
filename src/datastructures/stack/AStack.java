package datastructures.stack;

import datastructures.linkedlists.Node;

import java.util.ArrayList;

public class AStack {

    ArrayList values;
    int length;

    public AStack(){
        values = new ArrayList();
        length = 0;
    }

    public void push(int value){
        values.add(0,value);
    }

    public int peek(){
        return (int) values.get(0);
    }

    public int pop(){
        int removedElement = (int) values.remove(0);
        return removedElement;
    }

    public int getLastElement(){
        return (int) values.get(values.size()-1);
    }

}
