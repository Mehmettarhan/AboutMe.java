package day27_Recap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] array=new int[2];
        array[0]=10;
        array[1]=20;

        array= new int[4];
        array[2]=30;
        array[3]=40;
        System.out.println(Arrays.toString(array));

        int[] nums= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(nums.length);
        System.out.println(0);
        System.out.println(nums.length-1);

        for (int i = 4; i < nums.length; i++) {
            System.out.println(nums[i]+" ");

        }
    }
}
