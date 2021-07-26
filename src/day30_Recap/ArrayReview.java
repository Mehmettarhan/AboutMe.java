package day30_Recap;

import java.util.Arrays;

public class ArrayReview {
    public static void main(String[] args) {

       /*
       String item1= "eggs",
                item2="milk",
                item3="apple",
                item4="meat";

        */

        String[] items= new String[10]; //index: 0~9 <<>> the size of array is 10

        items[3]="milk";
        items[3]="eggs";
        items[7]="grade";

        System.out.println(Arrays.toString(items));

        int[]numbers={1,2,3,4,5,6,7,8,9,10};
        //      index:0,1,2,3,4,5,6,7,8,9
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i <= numbers.length-1 ; i++) {
            System.out.println(numbers[i]);

        }



        System.out.println("-------------------------------------------");
        int[] nums = {10,20,30,40,50};  // reverse task
        // index:         0, 1, 2, 3, 4

        int[] result= new int[nums.length]; // [50, 40, 30, 20, 10]
        //                                         0,   1,  2,  3,  4
        for (int i = nums.length-1, j=0; i >0 ; i--, j++) {
            result[j] = nums[i];


        }
        System.out.println(Arrays.toString(result));

        System.out.println("--------------------------------------------");

        String[] group1={"Sophia", "Feruza", "Zahra"};
        String[] group2= {"Mehmet", "Bilgun", "Danka", "Mucahit"};

        String[] group3= new String[group1.length + group2.length];

        int k=0;
        for (int i = 0; i <= group1.length-1 ; i++, k++) {
            group3[k] = group1[i];

        }

            for (int j = 0; j <= group2.length-1 ; j++, k++) {
               group3[k]= group2[j];

            }
        System.out.println(Arrays.toString(group3));

    }
}
