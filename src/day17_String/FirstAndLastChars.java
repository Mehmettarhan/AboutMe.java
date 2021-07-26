package day17_String;

import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.Scanner;

public class FirstAndLastChars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next(); // Level

        String first= word.substring(0,1); // L
        String last=word.substring(word.length()-1); // this is how you can get the last char of the word.

        if (first.equalsIgnoreCase(last)){ // Do not forget that Java is very case sensitive language!!
            System.out.println("Same");
        }else{
            System.out.println("Not same");
        }
        scan.close(); // always close your statement.....
    }
}
/*
3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */
