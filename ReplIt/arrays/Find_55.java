package arrays;

import java.util.Scanner;

public class Find_55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        boolean result=false;
        for (int i = 0; i < numbers.length-1 ; i++) {
            if (numbers[i]==5 && numbers[i+1]==5) {
                result=true;
                break;
            }

        }
        System.out.println(result);
    }
}
/*
Given an array nums, print true if the array contains a 5 next to a 5 anywhere in the array.
If no consecutive 5s or no 5s are detected in your code then print false.

nums → [1, 5, 5, 1, 1] → true
nums → [1, 8, 5, 5, 0] → true
nums → [1, 5, 4, 1, 5] → false
nums → [1, 4, 4, 1, 99] → false
 */