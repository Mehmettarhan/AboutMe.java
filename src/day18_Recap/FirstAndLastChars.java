package day18_Recap;

import java.util.Scanner;

public class FirstAndLastChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");

        String word1 = scan.next(); // "one"
        String word2 = scan.next(); // "eight"      ==> oneight

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {

            // last char of word1 == first char of word2

            System.out.println(word1 + word2.substring(1));

        }else{
            System.out.println(word1 + word2);
            System.out.println("-----------------------------------");
        }
        if(word1.substring(word1.length()-1).equalsIgnoreCase(""+word2.charAt(0) ) ){
            System.out.println(word1+word2.substring(1));
        }else {
            System.out.println(word1 + word2);
        }
        scan.close();

    }
}
