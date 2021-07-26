package day23_Arrays;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "aabcccd";

        char ch = 'c';
        int frequency = 0; // for the frequency of char
        // if you know starting and ending index of string, FOR LOOP is the best.
        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i); // every single chars that we have in string
            if (each == ch) { //if each char in str is matching with ch
                frequency++;
            }

        }
        System.out.println("frequency= "+frequency); // frequency cannot be negative.

    }

}
/*
1. Write a program that can find the frequency of any given character from a string
            Ex:
                str = "aabcccd";

                input: 'c'
                output: 3

                input: 'e'
                output: 0
 */
