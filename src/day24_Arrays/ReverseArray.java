package day24_Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5,6,7};
        int [] reverseArray= new int[array.length]; //to make sure that we have enough capacity for each element

        for (int i = array.length-1, j=0; i >=0 ; i--, j++) { //i is the index numbers of array starting from last index
                                                     // j is thr index numbers of array starting from index 0
            reverseArray[j++]=array[i]; // we get the elements of array starting from last index and store
               // why j++????
        }
        System.out.println(Arrays.toString(array)); // utility of the array
        System.out.println(Arrays.toString(reverseArray));

    }
}
