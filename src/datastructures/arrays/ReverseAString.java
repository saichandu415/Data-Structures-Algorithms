package datastructures.arrays;


public class ReverseAString {

    public StringBuilder reverse(String input){
        StringBuilder reversedString = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString.append(input.charAt(i));
        }
        return reversedString;
    }

    public static void main(String[] args) {
        ReverseAString reverseAString = new ReverseAString();
        final String reversedString = String.valueOf(reverseAString.reverse("Sai"));
        System.out.println(reversedString);
    }
}
