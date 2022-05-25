package algorithms.recursion;

public class TestFactorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int resultWIteration = factorial.getFactorialWithIteration(5);
        int resultWRecursion = factorial.getFactorialWithRecursion(5);
        System.out.println(resultWIteration);
        System.out.println(resultWRecursion);
    }
}
