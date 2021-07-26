package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();

        }
        //WRITE YOUR CODE HERE  defined
        int[] arr1 = new int[1];//size 1
        int[] arr2 = new int[2];

        if (size >= 2) {
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = num[i];

            }
            System.out.println(Arrays.toString(arr2));

        } else if (size < 2) {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = num[i];

            }
            System.out.println(Arrays.toString(arr1));
        }


    }
}
/*
Given an int array num of any length, print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

Examples:

input: 1, 2, 3
output: [1, 2]

input: 1
output: [1]
 */