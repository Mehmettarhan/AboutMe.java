package day18_Recap;

import java.util.Locale;
import java.util.Scanner;

public class WithOutX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // we will get input from user, that's why let's use Scanner mth.
        System.out.println("Enter a word:");
        String word=scan.next();

        if (word.toLowerCase().startsWith("x")){  // This how to ignore case sensitivity==>(word.toLowerCase()
            // or if (word.charAt(0)=='x' )
            System.out.println(word.substring(1) );

        }else{
            System.out.println(word);
        }
        scan.close();

        System.out.println("---------------------------------------");

        String sentence="I love Java programming language.";
        if(sentence.toLowerCase().contains("java")){ // we can ignore case sensitivity by creating "toLowerCase"
            System.out.println("Has Java");
        }else{
            System.out.println("Does not have Java.");

            System.out.println("----------------------------------");

            String s1="I love cats and dogs.";
            //boolean lovesCats=s1.equalsIgnoreCase("cats"); // verifies if s1 IS "CATS"
            boolean lovesCats=s1.toLowerCase().contains("cats"); // verifies if s1 has "cats"
            System.out.println(s1);
        }



    }
}
/*
1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */