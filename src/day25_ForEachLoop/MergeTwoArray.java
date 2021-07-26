package day25_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,200,67,456},
              arr2 = {5,6,45,789}; // arr3: {1,2,3,4,5,6}

        int[] arr3 = new int[arr1.length + arr2.length]; // making sure that arr3 has enough capacity to
         // {0,0,0,0,0,0}                                // contain the elements //merge:birlestirmek


        int j = 0; // for the index numbers of third array
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i]; // retrieves each element from arr1 and assigns to the indexes of arr3

        }

        for (int i = 0; i < arr2.length ; i++) { // for arr2
            arr3[j++] = arr2[i];
            // OR arr3[i+arr1.length] = arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        int[] a1={1,2,3,4,5};
        String[] s1={"A", "B"}; // ONLY MERGE ARRAYS THEY ARE MERGEABLE.. NUM TO NUM. STRING TO STRING


    }
}
/*
	2. write a program that can merge two arrays of integers
		Ex:
			arr1 = {1,2,3,4}
			arr2 = {5,6}

		output
			arr3 = {1,2,3,4,5,6}
 */