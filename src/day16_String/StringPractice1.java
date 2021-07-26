package day16_String;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a string:");
        String word= scan.next();  // programming

        /*
        String result= (word.length()==0)? "String is empty"
                :(word.length()>3)? word.substring(word.length()-3)
                :word;
                */

        String result="";

        if (word.length()==0){

            result="String is empty";
        }else if (word.length()>3){
            result=word.substring(word.length()-3);
        }else {
            result= word;
        }

        System.out.println(result);
        scan.close();
    }
}
/*
1. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself



3. write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"

4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */
