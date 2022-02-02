package datastructures.arrays;

import java.util.Arrays;

// Dynamic array data structure implementation in java
class DynamicArray {

    // Constants
    public static final String INDEX_OUT_OF_BOUND = "index out of bound";

    private String[] array;     // Store the data of array
    private int capacity;       // No of elements the array can hold
    private int currentLength;  // sore current length of array

    // constructor to initialize data
    public DynamicArray(){
        array = new String[1];
        capacity = 1;
        currentLength = 0;
    }

    // get(index) returns the item at the index
    public String get(int index){
        return index > -1 && index < currentLength ? array[index] : INDEX_OUT_OF_BOUND;
    }

    // push(item) will add item at the end of the dynamic array
    public void push(String item){
        // current length and the capacity becomes equal then we need to increase the array capacity and add items
        if(currentLength==capacity){

            String[] tempArray = new String[2 * currentLength];

            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
            capacity = currentLength*2;
        }
        array[currentLength] = item;
        currentLength++;
    }

    // replace(item,index) will replace the item at an index
    public void replace(String item, int index){
        if(index > -1 && index <currentLength)
            array[index] = item;
        else
            System.out.println(INDEX_OUT_OF_BOUND);
    }

    // remove last item of the array
    public void pop(){
        if(currentLength > 0)
            currentLength--;
    }

    // delete(index) deletes item at an specified index
    public void delete(int index){
        if(index > -1 && index < currentLength){
            if(index == currentLength-1)
                pop();
            else{
                for (int i = index; i < currentLength; i++) {
                    array[i] = array[i+1];
                }
                pop();
            }
        }else
            System.out.println(INDEX_OUT_OF_BOUND);
    }

    // length() return the current length of an array
    public int length(){
        return currentLength;
    }

    // getArray() returns the array excluding nulls
    public String[] getArray(){
        String[] tempArray = new String[currentLength];
        for (int i = 0; i < currentLength; i++) {
            tempArray[i] = array[i];
        }
        return tempArray;
    }



    public static void main(String[] args) {
        DynamicArray users = new DynamicArray();
        users.push("John");
        users.push("Noah");
        users.push("Oliver");
        users.replace("Liam", 2);
        users.delete(0);
        System.out.println(Arrays.toString(users.getArray()));
    }
}
