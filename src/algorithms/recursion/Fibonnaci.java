package algorithms.recursion;

public class Fibonnaci {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 33, 54, 87

    public int fibonacciWithRecursive(int value) {
        if (value == 0) {
            return 0;
        } else if (value == 1 || value == 2) {
            return 1;
        }
        return fibonacciWithRecursive(value - 1) + fibonacciWithRecursive(value - 2);
    }

    public int fibonnaciWithIterative(int value) {
        int val1 = 0, val2 = 0, result = 0;
        for (int i = 0; i <= value; i++) {
            if (i == 1) {
                val2 = 1;
            } else {
                val1 = val2;
                val2 = result;
            }
            result = val1 + val2;
        }
        return val2;
    }
}
