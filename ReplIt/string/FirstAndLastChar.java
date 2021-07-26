package string;

import java.util.Scanner;

public class FirstAndLastChar {

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = scan.next();
        //char ch= word.charAt(0);
        String first = word.substring(0, 1);
        String last = word.substring(word.length() - 1);

        System.out.println(first + last);
        scan.close();

    }
}
/*
Write a program that will print out first and last letters together.

Input: adobe
Input: adobe
Output: ae
 */
