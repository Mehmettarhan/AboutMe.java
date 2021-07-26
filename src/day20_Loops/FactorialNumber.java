package day20_Loops;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in); for more than one time
        int number=new Scanner(System.in).nextInt(); // only for one print // 5!=5*4*3*2*1=120
        int result=1;
        for (int i = number; i >=1 ; i--) {
            result *=i;

        }
        System.out.println("result= "+result);

    }
}
/*
1. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

3. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

        Ex:
            sentence = "cat dog dog cat"

            output:
                true
 */