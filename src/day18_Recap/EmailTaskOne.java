package day18_Recap;

import java.util.Scanner;

public class EmailTaskOne {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String email= "mike_tyson@gmail.com";
        int indexOf_=email.indexOf("_");
        int indexOfAt=email.indexOf("@");
        String firstName= email.substring(0,indexOf_);
        String lastName=email.substring(indexOf_+1, indexOfAt);
        String remaining=email.substring(indexOfAt);

        System.out.println("firstName= "+firstName);
        System.out.println("lastName= "+lastName);
        System.out.println("remaining= "+remaining);

        String result= lastName+"_"+firstName+remaining;
        System.out.println(result);

    }
}
/*
1. EmailTask1:
   Assume that email address is constructed by person's first name and followed by an underscore and last name.
   Write a program that can swap first name with last name in the email (Seperated by an underscore).
   If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
 */