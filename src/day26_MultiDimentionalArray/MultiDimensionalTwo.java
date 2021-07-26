package day26_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalTwo {
    public static void main(String[] args) {

        // int[] nums={1,2,3};
       // int[][] nums={{1,2,3}, {4,5}};  // length of this array is 2.
        int[][][] arr3D ={ {{1,2,3} , {4,5}} , {{6,7,8}, {9,10}} };
        // index :             0                       1

        System.out.println( Arrays.deepToString(arr3D) );

        // {{6,7,8}, {9,10}}
        System.out.println( Arrays.deepToString(arr3D[1]) );

        // {4,5}
        System.out.println( Arrays.toString(arr3D[0][1]) );

        // 8
        System.out.println( arr3D[1][0][2]);

        System.out.println("--------------=====================-----------------");

        for ( int[][] each2D : arr3D ){ // for getting each 2D arrays from each arr3D
            for (int[] each1D : each2D ){ // for getting 1D arrays from each arr2D
                for (int element : each1D ){ // for getting each element from each single dimensional array
                    System.out.println(element+" ");

                }
                System.out.println(); // append new line after print the elements of each 1 dimensional array
            }
        }
        System.out.println("---------------===========================-------------------");



    }
}
