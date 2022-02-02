package datastructures.arrays;


import java.util.Arrays;

public class ReverseAString {

    public String reverse(String input){
        char[] inputArr = input.toCharArray();
        final int inputLength = inputArr.length;
        char[] reverseArr = new char[inputLength];
        for (int i = 0; i < inputLength; i++) {
            reverseArr[i] = inputArr[inputLength-i-1];
        }
        return String.valueOf(reverseArr);
    }

    public static void main(String[] args) {
        ReverseAString reverseAString = new ReverseAString();
        final String reversedString = reverseAString.reverse("Sai");
        System.out.println(reversedString);
    }
}
