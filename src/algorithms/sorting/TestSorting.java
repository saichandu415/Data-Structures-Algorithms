package algorithms.sorting;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;

public class TestSorting {

    public static void main(String[] args) {
        int[] input = {1, 4, 7, 3, 8, 2, 9, 5};
//        System.out.println(Arrays.toString(doBubbleSort(input)));
//        System.out.println(Arrays.toString(doSelectionSort(input)));
//        System.out.println(Arrays.toString(doInsertionSort(input)));
//        System.out.println(doMergeSort(Arrays.asList(1, 4, 7, 3, 8, 2, 9, 5, 6)));
    }

    public static int[] doBubbleSort(int[] input) {
        int[] ip = input;
        boolean isChanged = true;
        while (isChanged) {
            isChanged = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (ip[i] > ip[i + 1]) {
                    int temp = ip[i];
                    ip[i] = ip[i + 1];
                    ip[i + 1] = temp;
                    isChanged = true;
                }
            }
        }
        System.out.println(Arrays.toString(ip));
        return ip;
    }

    public static int[] doSelectionSort(int[] input) {
        int[] ip = input;
        for (int i = 0; i < ip.length; i++) {
            int temp = ip[i];
            int jIndex = i;
            for (int j = i; j < ip.length; j++) {
                if (temp > ip[j]) {
                    temp = ip[j];
                    jIndex = j;
                }
            }
            if (i != jIndex) {
                ip[jIndex] = ip[i];
                ip[i] = temp;
            }
        }
        return ip;
    }

    public static int[] doInsertionSort(int[] input) {

        // {1, 4, 7, 3, 8, 2, 9, 5}

        int[] ip = input;
        for (int i = 1; i < ip.length; i++) {
            int temp = ip[i];
            for (int j = i - 1; j >= 0; j--) {
                if (temp < ip[j]) {
                    ip[j + 1] = ip[j];
                    ip[j] = temp;
                }
            }
        }
        return ip;
    }

    public static List<Integer> doMergeSort(List<Integer> value) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        if (value.size() == 1)
            return value;

        left = (List<Integer>) value.subList(0, value.size() / 2);
        right = (List<Integer>) value.subList(value.size() / 2, value.size());
        return merge(doMergeSort(left), doMergeSort(right));

    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<>();

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                result.add(left.get(leftIndex));
                leftIndex++;
            } else {
                result.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        List<Integer> leftRemaining = left.subList(leftIndex, left.size());
        List<Integer> rightRemaining = right.subList(rightIndex, right.size());

        result.addAll(leftRemaining);
        result.addAll(rightRemaining);

        return result;
    }

    private static int[] doQuickSort(int[] input, int leftIndex, int rightIndex) {
        // TODO: EDIT THIS NOT DONE
        findPartitionIndex(input, leftIndex, rightIndex);
        return null;
    }

    private static int findPartitionIndex(int[] input, int leftIndex, int rightIndex) {
        // TODO : TEST THIS
        int partitionIndex = 0;
        int pivot = input[0];

        while (leftIndex < input.length && rightIndex > 0 && leftIndex > rightIndex) {
            int temp = 0;
            if (input[leftIndex] < pivot) {
                temp = input[leftIndex];
                input[leftIndex] = input[rightIndex];
                input[rightIndex] = temp;
            } else
                leftIndex++;
            if (input[rightIndex] > pivot) {
                temp = input[leftIndex];
                input[leftIndex] = input[rightIndex];
                input[rightIndex] = temp;
            } else
                rightIndex++;
        }

        return partitionIndex;
    }


}
