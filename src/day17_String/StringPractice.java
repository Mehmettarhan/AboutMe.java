package day17_String;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {

        String gmail="Cybertek@gmail.com";

        String domain= gmail.substring(gmail.indexOf(0));
        boolean isValidGmail=gmail.endsWith("gmail.com");
        System.out.println("isValidGmail= "+isValidGmail);

        System.out.println("---------------------------------------------");

        String url="www.amazon.com";

        boolean isValidUrl=url.startsWith("www.")|| (url.endsWith(".com")
                && url.endsWith(".edu")|| (url.endsWith(".gov")));
        System.out.println("isValidUrl= "+isValidUrl);

        System.out.println("----------------------------------------------");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scan.next();
         boolean endsWithLY= word.substring(word.length()-2).equals("ly");
         boolean endsWithLY2=word.endsWith("ly");

         if(endsWithLY){
             System.out.println("Really");
         }else{
             System.out.println("Never mind");
         }
         scan.close();
    }
}
/*
task:
    1. write a program to verify if the gmail is valid
            requirments:
                    a valid gmail account should end with @gmail.com

    2. write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov

    3. ask the user to enter a word.
        if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */