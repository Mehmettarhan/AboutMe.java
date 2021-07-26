package day25_ForEachLoop;

import java.util.Arrays;

public class MergeThreeArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4},
                arr2 = {5,6},
                arr3 = {7,8,9,12};

        int[] arr4 = new int[arr1.length + arr2.length + arr3.length];

        int j=0; // for the indexes of the 4th array

        for (int i = 0; i < arr1.length; i++) {
            arr4[j++]=arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            arr4[j++]=arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            arr4[j++]=arr3[i];
        }

        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4);




    }
}
