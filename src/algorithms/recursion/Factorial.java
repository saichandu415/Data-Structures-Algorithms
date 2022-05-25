package algorithms.recursion;

public class Factorial {

    public int getFactorialWithIteration(int value) {
        int result = 1;
        while (value > 1) {
            result = result * value;
            value--;
        }
        return result;
    }

    public int getFactorialWithRecursion(int value) {
        int result = value;
        if (value == 1)
            return result * 1;
        else
            value--;
        return result * getFactorialWithRecursion(value);
    }
}
