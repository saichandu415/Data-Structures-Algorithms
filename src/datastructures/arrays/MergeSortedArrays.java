package datastructures.arrays;


import java.util.Arrays;

public class MergeSortedArrays {

    /*
    * Input 1 : [0,3,4,31]
    * Input 2 : [4,6,30]
    * Output  : [0,3,4,4,6,30,31]
    * */

    public int[] merge(int[] input1, int[] input2){
        int i=0,j=0,k=0;
        int[] resultArr = new int[input1.length+ input2.length];

        while(i < input1.length && j < input2.length){
            if(input1[i]<input2[j]){
                resultArr[k] = input1[i];
                i++;
            }else{
                resultArr[k] = input2[j];
                j++;
            }
            k++;
        }

        while(i < input1.length){
            resultArr[k] = input1[i];
            i++;
            k++;
        }

        while(j < input2.length){
            resultArr[k] = input2[j];
            j++;
            k++;
        }

        return resultArr;
    }

    public static void main(String[] args) {
        MergeSortedArrays mergeSortedArrays = new MergeSortedArrays();
        final int[] mergedArr = mergeSortedArrays.merge(new int[]{0, 3, 4, 31}, new int[]{4, 6, 30});
        System.out.println(Arrays.toString(mergedArr));
    }
}
