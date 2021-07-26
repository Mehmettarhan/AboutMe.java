package arrays;

import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();

        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows

        int biggest=arr[0][0];
        for (int[] each1D : arr) {
            for (int eachElement : each1D) {

                if (eachElement>biggest){
                    biggest=eachElement;
                }

            }

        }
        System.out.println(biggest);
    }
}